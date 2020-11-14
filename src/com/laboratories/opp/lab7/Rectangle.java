package com.laboratories.opp.lab7;

public abstract class Rectangle extends Figure{
    Integer a;
    Integer b;

    public Rectangle(Integer a, Integer b){
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
