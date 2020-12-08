package com.laboratories.opp.lab8;
public class GeometricBodyController {

    public static GeometricBody biggestVolume (GeometricBody[] geometricBodies){
        double [] maxVolume = new double [geometricBodies.length];
        for (int i = 0; i < maxVolume.length; i++) {
            maxVolume[i] = geometricBodies[i].getVolume();
        }
        double maxValue = maxVolume[0];
        int index = 0;
        for(int a = 0; a < maxVolume.length; a++)
        {
            if(maxValue < maxVolume[a])
            {
                maxValue = maxVolume[a];
                index = a;
            }
        }
        return geometricBodies[index];
    }
    public static GeometricBody biggestSurface (GeometricBody[] geometricBodies){
        double [] maxSurface = new double [geometricBodies.length];
        for (int i = 0; i < maxSurface.length; i++) {
            maxSurface[i] = geometricBodies[i].getSurface();
        }
        double maxValue = maxSurface[0];
        int index = 0;
        for(int a = 0; a < maxSurface.length; a++)
        {
            if(maxValue < maxSurface[a])
            {
                maxValue = maxSurface[a];
                index = a;
            }
        }
        return geometricBodies[index];
    }




}
