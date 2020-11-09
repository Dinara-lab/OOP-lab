package com.laboratories.opp.lab7;

public abstract class Square extends Figure {
    Integer a;

    public Square(Integer a){
       this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
