package com.laboratories.opp.lab7;
abstract class Figure {

    public abstract Integer getArea();
    public abstract Integer getPerimeter();

    public static void main(String[] args) {

        Square obj1 = new Square(10) {
            @Override
            public Integer getArea() {
                return a * a;
            }

            @Override
            public Integer getPerimeter() {
                return a * 4;
            }
        };
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());

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
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(87, 30, 50) {
            @Override
            public Integer getArea() {
                return a*b*c ;
            }

            @Override
            public Integer getPerimeter() {
                return a+b+c;
            }
        };
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Figure[] figures = {obj1,triangle,rectangle};
        System.out.println(FigureController.getMaxArea(figures).toString());

    }



}


