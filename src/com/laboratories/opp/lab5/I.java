package com.laboratories.opp.lab5;

public class I extends H {
    protected String i;
    public I (String i){
        super("h");
        this.i = i;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " i='" + i + " x.value=" + getX().getValue()+"'}");

    }
}
