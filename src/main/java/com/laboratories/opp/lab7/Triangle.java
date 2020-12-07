package com.laboratories.opp.lab7;

public class Triangle extends Figure {
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

    @Override
    public double getArea() {
        double p = (a+b+c)/2.0;
        return Math.sqrt (p * (p - a) * (p - b) * (p -c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
