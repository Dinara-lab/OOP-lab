package com.laboratories.opp.lab5;

public class G extends F{
    protected String g;
    public G (String g){
        super("f");
        this.g = g;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " g='" + g + "'}");

    }
}
