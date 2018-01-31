package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/1/30.
 */
public class OrderDetail implements Serializable {

    private  int id;
    private int itemCount;
    private double itemPrice;
    private double totalPrice;


    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", itemCount=" + itemCount +
                ", itemPrice=" + itemPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
