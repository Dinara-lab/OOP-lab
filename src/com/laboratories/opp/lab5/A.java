package com.laboratories.opp.lab5;

public class A {
    protected  String a;
    //X variable;
    protected X variable = new X ("xxx");

    public  A (String string, X variable){
        this.a = string;
        //this.variable = new X ("some name");

    }
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "property a='" + a + '\'' + " value:" + variable.getValue() +
                '}';
    }
}
