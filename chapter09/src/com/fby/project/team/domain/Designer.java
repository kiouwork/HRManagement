package com.fby.project.team.domain;

/**
 * ClassName: Designer
 * Package: com.fby.project.team.domain
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 22:43
 * @Version: V0.1
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails()+ "\t设计师" + "\t" + getStatus() + "\t" + getBonus() + "\t\t\t" + getEquipment().getDesciption();
    }
    public String getDatailsForTeam(){
        return getBasicDetailsForTeam() + "设计师\t" + getBonus();
    }
}
