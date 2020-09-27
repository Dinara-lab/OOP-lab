package com.laboratories.opp.lab2;

public class BoxProperties {
    int height;
    int width;
    int depth;
    int length;


    public BoxProperties(){
        this.height = this.width=this.depth = 1;
    }

    public  BoxProperties(int sameValue){
        this.height = this.width=this.depth = sameValue;
    }


    public  BoxProperties(int height , int width, int depth, int length){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.length = length;
    }

    public int surfaceArea(){
        int surface;
         return surface = 2 *(length*height + width * height + length*width );
    }

    public int volume (){
       int volume;
        return  volume = height*length*width;
    }

    @Override
   public String toString(){
        return "Height:" +  height+ " "+ "Width:" + width + " " + "Depth:" + depth + "Length: " + length;
    }

}