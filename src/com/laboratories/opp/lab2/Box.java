package com.laboratories.opp.lab2;

public class Box {
    public static void main(String[] args) {
        BoxProperties box1 = new BoxProperties();
        BoxProperties box2 = new BoxProperties(20);
        BoxProperties box3 = new BoxProperties(10,20, 30,40);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println("Surface: " + box3.surfaceArea());
        System.out.println("Volume :" + box3.volume());
    }
}
