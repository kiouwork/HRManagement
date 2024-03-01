package com.fby.project.team.domain;

/**
 * ClassName: PC
 * Package: com.fby.project.team.domain
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 22:01
 * @Version: V0.1
 */
public class PC implements Equipment{
    private String model;//机器型号
    private String display;//显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDesciption() {
        return model + "(" + display + ")";
    }
}
