package com.laboratories.opp.lab8;

public interface GeometricBody {

    double getSurface();
    double getVolume();

    static void main(String[] args) {
        Cub cub = new Cub(4.6);
        System.out.println("Cub volume :" + cub.getVolume());
        System.out.println("Cub surface : " + cub.getSurface());

        Sphere sphere = new Sphere(5.56);
        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Sphere surface :" + sphere.getSurface());

        Parallelepiped parallelepiped = new Parallelepiped(3.6,1.7,5);
        System.out.println("Paralel volume : " + parallelepiped.getVolume());
        System.out.println("Paralel surface : " + parallelepiped.getSurface());

       GeometricBody[]geometricBodies = {cub,sphere,parallelepiped};
        System.out.println("Figure with greatest volume : " + GeometricBodyController.biggestVolume(geometricBodies));
        System.out.println("Figure with greatest surface: " + GeometricBodyController.biggestSurface(geometricBodies));
    }
}
