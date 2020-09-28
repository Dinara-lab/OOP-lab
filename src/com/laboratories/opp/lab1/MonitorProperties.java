package com.laboratories.opp.lab1;

    public class MonitorProperties {
    private String color;
    private int screenRefreshRate;
    private int resolution;

    public MonitorProperties(String color, int screenRefreshRate, int resolution) {
        this.color = color;
        this.screenRefreshRate = screenRefreshRate;
        this.resolution= resolution;
    }

    public String showInfo(){
        return   "Color:" + color+ " " +
                 "Height:" + screenRefreshRate+ "Hz" + " " +
                 "Resolution:" + resolution +"p";
    }

}
