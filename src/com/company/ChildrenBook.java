package com.company;

import java.sql.SQLOutput;

public class ChildrenBook extends Book {
private int age;

    @Override
    public double getPrice() {
        System.out.println(getTitle()+ " is on sale 70%");
        double originalPrice = super.getPrice();
        return originalPrice*0.7;

    }
}
