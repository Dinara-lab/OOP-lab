package com.laboratories.opp.lab5;

public class H extends G{
    protected String h;
    private X variable = new X("zzz");

    public H(String string){
        super("g");
        this.h = string;
    }
    public X getX(){
        return variable;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", " h='" + h + " value:" + variable.getValue() + "'}");

    }
}
