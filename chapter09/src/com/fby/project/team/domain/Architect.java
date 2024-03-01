package com.fby.project.team.domain;

/**
 * ClassName: Architect
 * Package: com.fby.project.team.domain
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 22:48
 * @Version: V0.1
 */
public class Architect extends Designer {
    private int stock;//股票数量

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails()+ "\t架构师" + "\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDesciption();
    }
    public String getDatailsForTeam(){
        return getBasicDetailsForTeam() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}