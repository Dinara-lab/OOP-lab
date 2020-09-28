package com.laboratories.opp.lab2;

public class BoxProperties {
    private int boxHeight;
    private int boxWidth;
    private int boxDepth;

    public BoxProperties(){
        this.boxHeight = this.boxWidth=this.boxDepth = 1;
    }

    public BoxProperties(int value){
        this.boxHeight = this.boxWidth=this.boxDepth = value;
    }

    public BoxProperties(int height, int width, int length){
        this.boxHeight = height;
        this.boxWidth = width;
        this.boxDepth = length;
    }

    public int surfaceArea(){
        return 2 *(boxDepth * boxHeight + boxWidth * boxHeight + boxDepth * boxWidth );
    }

    public int volume (){
        return boxHeight * boxDepth *boxWidth;
    }

    @Override
   public String toString(){
        return "Height:" +  boxHeight + " " + "Width:" + boxWidth + " " + "Depth: " + boxDepth;
    }

}
