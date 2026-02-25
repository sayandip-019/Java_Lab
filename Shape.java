public class Shape {

    public static void main(String args[]) {

        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(4);
        Circle c = new Circle(3);

        r.rectArea();
        s.sqArea();
        c.cirArea();
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void rectArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void sqArea() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void cirArea() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}