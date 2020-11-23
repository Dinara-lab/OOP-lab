package com.laboratories.opp.lab7;

public  class Square extends Figure {
     double a;

    public Square(double a){
        super(0);
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public double getPerimeter() {
        return a * 4.0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
