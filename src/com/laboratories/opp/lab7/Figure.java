package com.laboratories.opp.lab7;
abstract class Figure {

    Integer raza;


    public Figure(Integer raza){
        this.raza = raza;
    }

    public abstract Integer getArea();
    public abstract Integer getPerimeter();

    public static void main(String[] args) {

        Square square = new Square(1) {
            @Override
            public Integer getArea() {
                return a * a;
            }

            @Override
            public Integer getPerimeter() {
                return a * 4;
            }
        };


        Rectangle rectangle = new Rectangle(1, 10) {
            @Override
            public Integer getArea() {
                return a * b;
            }

            @Override
            public Integer getPerimeter() {
                return a + a + b + b;
            }
        };


        Triangle triangle = new Triangle(1, 3, 5) {
            @Override
            public Integer getArea() {
                return a*b*c ;
            }

            @Override
            public Integer getPerimeter() {
                return a+b+c;
            }
        };
        Figure circle = new Figure(1) {
            @Override
            public Integer getArea() {
                return 3*raza*raza;
            }

            @Override
            public Integer getPerimeter() {
                return 2* 3 * raza;
            }
            @Override
            public String toString() {
                return "Circle{" +
                        "raza=" + raza + '}';
            }
        };

        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter() + "\n");

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle parameter: " + rectangle.getPerimeter() + "\n");

        System.out.println("Triangle area: "+ triangle.getArea());
        System.out.println("Triangle perimeter "+ triangle.getPerimeter()+ "\n");

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter() + "\n");

        Figure[] figures = {square,triangle,rectangle,circle};
        System.out.println("Figure with max area: " + FigureController.getMaxArea(figures).toString());
        System.out.println("Figure with max perimeter: " + FigureController.getMaxPerimeter(figures).toString());

    }



}


