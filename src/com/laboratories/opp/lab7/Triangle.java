package com.laboratories.opp.lab7;

public abstract class Triangle extends Figure {
    Integer a;
    Integer b;
    Integer c;

    public Triangle(Integer a, Integer b, Integer c){
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
