import java.util.Scanner;


abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        product_id = id;
    }

    abstract void input();
    abstract void display();
}

class TravelGuide extends AbstractProduct {
    String title;
    String author;
    double price;

    TravelGuide(int id) {
        super(id);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Travel Guide Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("\n--- Travel Guide Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


class CD extends AbstractProduct {
    String title;
    String artist;
    double price;

    CD(int id) {
        super(id);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CD Title: ");
        title = sc.nextLine();
        System.out.print("Enter Artist: ");
        artist = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("\n CD Details");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: " + price);
    }
}


public class Main {
    public static void main(String[] args) {

        AbstractProduct p;


        p = new TravelGuide(8219);
        p.input();
        p.display();

        p = new CD(102);
        p.input();
        p.display();
    }
}

