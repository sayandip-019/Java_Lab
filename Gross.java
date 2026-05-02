import java.util.Scanner;

interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int empId;

    void getEmployee(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
    }
}

class Salary {
    double basic;
    double hra;
    double da;

    void getSalary(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }
}


class PaySlip extends Employee implements Gross {
    Salary s = new Salary();

    void getData(Scanner sc) {
        getEmployee(sc);
        s.getSalary(sc);
    }

  
    public double calculateGross() {
        return s.basic + s.hra + s.da;
    }

    void display() {
        System.out.println("\n Pay Slip");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic: " + s.basic);
        System.out.println("HRA: " + s.hra);
        System.out.println("DA: " + s.da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PaySlip p = new PaySlip();
        p.getData(sc);
        p.display();

        sc.close();
    }
}
