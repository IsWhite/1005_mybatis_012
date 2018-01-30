package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/1/30.
 */
public class OrderDetail implements Serializable {

    private  int id;

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                '}';
    }
}
