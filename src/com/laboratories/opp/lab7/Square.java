package com.laboratories.opp.lab7;

public abstract class Square extends Figure {
    Integer a;

    public Square(Integer a){
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
