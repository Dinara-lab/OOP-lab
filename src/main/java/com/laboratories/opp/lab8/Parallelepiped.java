package com.laboratories.opp.lab8;

public class Parallelepiped implements GeometricBody {
    double L;
    double l;
    double h;

    public Parallelepiped(double L, double l, double h){
        this.L = L;
        this.l = l;
        this.h = h;
    }


    @Override
    public double getSurface() {
        return 2 * (L * h + l * h + L *l);
    }

    @Override
    public double getVolume() {
        return L * l * h;
    }
    @Override
    public String toString(){
        return "parallelepiped";
    }
}
