package com.laboratories.opp.lab7;
abstract class Figure {

    double r;
    final double Pi = 3.14;

    public Figure(double r){
        this.r = r;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public static void main(String[] args) {
        Square square = new Square(4.0);
        Rectangle rectangle = new Rectangle(3.0, 6.5);
        Triangle triangle = new Triangle(2.56, 6.75, 5.80);

        Figure circle = new Figure(2.5) {

            @Override
            public double getArea() {
                return Math.pow(r,2) * Pi;
            }

            @Override
            public double getPerimeter() {
                return 2* Pi * r;
            }
            @Override
            public String toString() {
                return "Circle{" +
                        "r=" + r + '}';
            }
        };
        Figure[] figures = {square,triangle,rectangle,circle};

        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter() + "\n");

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter() + "\n");

        System.out.println("Triangle area: "+ triangle.getArea());
        System.out.println("Triangle perimeter "+ triangle.getPerimeter()+ "\n");

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter() + "\n");


        System.out.println("Figure with max area: " + FigureController.getMaxArea(figures).toString());
        System.out.println("Figure with max perimeter: " + FigureController.getMaxPerimeter(figures).toString());

    }



}


