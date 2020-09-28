package com.laboratories.opp.lab2;

public class Box {
    public static void main(String[] args) {
        BoxProperties box1 = new BoxProperties();
        BoxProperties box2 = new BoxProperties(20);
        BoxProperties box3 = new BoxProperties(10, 30,40);
        System.out.println("Box1: " + box1);
        System.out.println("Box2: " + box2);
        System.out.println("Box3: " + box3);
        System.out.println("Box Surface = " + box3.surfaceArea() + " m^2");
        System.out.println("Box Volume = " + box3.volume() + " m^3");
    }
}
