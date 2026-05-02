class Vehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    Vehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

  
    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
    }
}


class Car extends Vehicle {
    double discountRate;

    Car(String name, int number, double price, double rate) {
        super(name, number, price);
        discountRate = rate;
    }

    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    void discount() {
        double discountAmount = (modelPrice * discountRate) / 100;
        double finalPrice = modelPrice - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tesla", 101, 5000000, 10);

        c.display();
        c.discount();
    }
}