package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/1/30.
 */
public class Clazz  implements Serializable{
    private int id;
    private String name;
    private String infor;

    public Clazz() {
    }

    public Clazz(String name, String infor) {
        this.name = name;
        this.infor = infor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", infor='" + infor + '\'' +
                '}';
    }
}
