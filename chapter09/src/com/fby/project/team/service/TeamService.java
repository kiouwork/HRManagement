package com.fby.project.team.service;

import com.fby.project.team.domain.Architect;
import com.fby.project.team.domain.Designer;
import com.fby.project.team.domain.Employee;
import com.fby.project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: com.fby.project.team.service
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/6 - 18:57
 * @Version: V0.1
 */
public class TeamService {
    private static int counter = 1;//给menberID自动赋值
    private  final int MAX_MEMBER =5;
    private Programmer[] team = new Programmer[MAX_MEMBER];//开发团队的数组
    private int total = 0;//记录开发团队中的人数；

    /**
     * 返回当前团队的所有对象
     * @return 包含所有成员对象的数组，数组大小与成员人数一致
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 向团队中添加成员
     * @param e 待添加成员的对象
     * @throws TeamException 添加失败，TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException{
        //成员已满无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满无法添加：");
        }
        //该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已是某团队成员
        Programmer p = (Programmer) e;
        Status status = p.getStatus();

        switch (status){
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
        //该员工已在本开发团队中
        boolean isExist = isExist(p);
        if(isExist){
            throw new TeamException("该员工已在本开发团队中");
        }
        //团队中至多只能有一名构架师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员
        int progNum = 0;
        int desNum = 0;
        int arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                arcNum++;
            }else if(team[i] instanceof Designer){
                desNum++;
            }else {
                progNum++;
            }
        }

        if(p instanceof Architect){
            if(arcNum >= 1){
                throw new TeamException("团队中至多只能有一名构架师");
            }
        }else if(p instanceof Designer){
            if (desNum >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else{
            if(progNum >=3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(status.BUSY);
    }

    /**
     * 判断p是否存在于当前的开发团队中
     * @param p
     * @return
     */
    private boolean isExist(Programmer p){
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == p.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * 从团队在删除成员
     * @param memberId 待删除成员的memberId
     * @throws TeamException 找不到指定的memberId的员工，删除失败
     */
    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                //找到该员工，调整对应属性
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total){
            throw new TeamException("找不到指定memberId员工，删除失败");
        }

        //调整数组
        for (int j = i; j < total -1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;

    }

}
