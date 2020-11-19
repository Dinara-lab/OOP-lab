package com.laboratories.opp.lab7;

public abstract class Square extends Figure {
     double a;

    public Square(double a){
        super(0);
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
