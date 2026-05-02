import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void display();
}

class Customer {
    String name;
    int customerId;

    void getCustomer(Scanner sc) {
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
        sc.nextLine();
    }
}

class Account {
    int accNo;
    double balance;

    void getAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }
}


class BankSystem extends Customer implements Bank {
    Account acc = new Account();

    void getData(Scanner sc) {
        getCustomer(sc);
        acc.getAccount(sc);
    }

    public void deposit(double amount) {
        acc.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void display() {
        System.out.println("\n Account Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Account No: " + acc.accNo);
        System.out.println("Balance: " + acc.balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem b = new BankSystem();

        b.getData(sc);

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    b.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    b.withdraw(sc.nextDouble());
                    break;

                case 3:
                    b.display();
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
