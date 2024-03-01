package com.fby.project.team.domain;

/**
 * ClassName: Printer
 * Package: com.fby.project.team.domain
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/2 - 22:12
 * @Version: V0.1
 */
public class Printer implements Equipment {
    private String name;//打印机名称
    private String type;//机器类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDesciption() {
        return name + "(" + type + ")";
    }
}
