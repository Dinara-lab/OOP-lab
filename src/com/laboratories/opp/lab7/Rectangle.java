package com.laboratories.opp.lab7;

public abstract class Rectangle extends Figure{
    double a;
    double b;

    public Rectangle(double a, double b){
        super(0);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
