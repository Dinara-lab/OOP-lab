package com.laboratories.opp.lab7;

public  class Rectangle extends Figure{
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
    @Override
    public double getArea() {
        return  a * b;
    }
    @Override
    public double getPerimeter() {
        return 2.0 *(a+b);
    }
}
