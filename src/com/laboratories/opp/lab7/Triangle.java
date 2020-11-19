package com.laboratories.opp.lab7;

public abstract class Triangle extends Figure {
     double a;
     double b;
     double c;

    public Triangle(double a, double b, double c){
        super(0);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
