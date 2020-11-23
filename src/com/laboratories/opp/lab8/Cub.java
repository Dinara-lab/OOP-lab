package com.laboratories.opp.lab8;

public class Cub implements GeometricBody {
    double a;

    public Cub(double a){
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6.0 * Math.pow(a,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(a,3);
    }
    @Override
    public String toString(){
        return "cub";
    }
}
