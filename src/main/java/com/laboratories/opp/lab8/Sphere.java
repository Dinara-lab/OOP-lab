package com.laboratories.opp.lab8;

public class Sphere implements GeometricBody {
    double r;

    public Sphere (double r){
        this.r = r;
    }
    @Override
    public double getSurface() {
        return 4.0 * Math.pow(r,2);
    }
    @Override
    public double getVolume() {
        return 4.0 * Math.pow(r,3)/3;
    }
    @Override
    public String toString(){
        return "sphere";
    }
}
