package com.laboratories.opp.lab7;

public class FigureController {
     Object[] figures;

    public FigureController(Object[] figures) {
        this.figures = figures;
    }

    public static Figure getMaxArea(Figure[] figures) {
        double[] maxArea = new double[figures.length];
        for (int i = 0; i < maxArea.length; i++) {
             maxArea[i] = figures[i].getArea();
        }
        double maxValue = maxArea[0];
        int index = 0;
        for(int a = 0; a < maxArea.length; a++)
        {
            if(maxValue < maxArea[a])
            {
                maxValue = maxArea[a];
                index = a;
            }
        }
        return figures[index];
    }
    public static Figure getMaxPerimeter(Figure[] figures) {
        double[] maxPerimeter = new double [figures.length];
        for (int i = 0; i < maxPerimeter.length; i++) {
            maxPerimeter[i] = figures[i].getPerimeter();
        }
        double maxValue = maxPerimeter[0];
        int index = 0;
        for(int a = 0; a < maxPerimeter.length; a++)
        {
            if(maxValue < maxPerimeter[a])
            {
                maxValue = maxPerimeter[a];
                index = a;
            }
        }
        return figures[index];
    }
    @Override
    public String toString() {
        String string = "";
        int i = 0;
        while (figures[i] != null) {
            string += figures[i] + "\n";
            i++;
        }
        return string;
    }
}

