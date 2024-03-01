package com.fby.project.team.service;

import com.fby.project.team.domain.*;

import static com.fby.project.team.service.Data.*;
/**
 * ClassName: NameListService
 * Package: com.fby.project.team.service
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 23:22
 * @Version: V0.1
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        //根据项目提供的Data类构建相应大小的employee数组
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取通用属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int index){
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);

        String modeOrName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];

        switch (equipmentType){
            case PC:
                return new PC(modeOrName,priceOrDisplayOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(priceOrDisplayOrType);
                return new NoteBook(modeOrName,price);
            case PRINTER:
                return new Printer(modeOrName,priceOrDisplayOrType);
        }
        return null;
    }
    public Employee[] getAllEmployees(){
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(id ==employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
