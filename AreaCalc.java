class AreaCalc {

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }
}

public class Area {
    public static void main(String[] args) {

        AreaCalc a = new AreaCalc();

        System.out.println("Area of Square: " + a.calculateArea(5));
        System.out.println("Area of Rectangle: " + a.calculateArea(5, 10));
        System.out.println("Area of Circle: " + a.calculateArea(3.5f));
    }
}