package com.laboratories.opp.lab1;

public class Monitor {
    public static void main (String [] args ){
        MonitorProperties m1 = new MonitorProperties("red", 59, 1080);
        MonitorProperties m2 = new MonitorProperties("blue", 59, 1080);
        System.out.println("Monitor1:" + m1.showInfo());
        System.out.println("Monitor2:" + m2.showInfo());
        if (m1.showInfo().equals(m2.showInfo())){
            System.out.println("The properties are equal");
        }else {
            System.out.println("The properties are not equal");
        }
    }
}
