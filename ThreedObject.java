import java.util.Scanner;

abstract class ThreedObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}


class Box extends ThreedObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + l*h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreedObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }
}

class Cylinder extends ThreedObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}


class Cone extends ThreedObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h); 
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreedObject obj;
        System.out.print("Enter l b h for Box: ");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Area = " + obj.wholeSurfaceArea());
        System.out.println("Box Volume = " + obj.volume());
        System.out.print("\nEnter side for Cube: ");
        obj = new Cube(sc.nextDouble());
        System.out.println("Cube Area = " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume = " + obj.volume());
        System.out.print("\nEnter r h for Cylinder: ");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Area = " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume = " + obj.volume());
        System.out.print("\nEnter r h for Cone: ");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Area = " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume = " + obj.volume());

        sc.close();
    }
}
