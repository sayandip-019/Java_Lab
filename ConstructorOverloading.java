public class ConstructorOverloading {

    String name;
    int age;

    
    ConstructorOverloading(String n) {
        name = n;
        System.out.println("Name: " + name);
    }

    
    ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading("Sayandip",20);
        ConstructorOverloading obj2 = new ConstructorOverloading("Khusi", 20);
    }
}