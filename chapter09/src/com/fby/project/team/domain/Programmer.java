package com.fby.project.team.domain;

import com.fby.project.team.service.Status;

/**
 * ClassName: Programmer
 * Package: com.fby.project.team.domain
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 22:27
 * @Version: V0.1
 */
public class Programmer extends Employee{
    private int memberId;//开发团队中的TID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberid) {
        this.memberId = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员" + "\t" + status + "\t\t\t\t\t" + equipment.getDesciption();
    }

    protected String getBasicDetailsForTeam(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" +getAge() + "\t" + getSalary() + "\t";
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() + "程序员";
    }
}
