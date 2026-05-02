interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double saleAmount;
    String clientName;


    public void processSale(double amount) {
        saleAmount = amount;
        System.out.println(" Sales Department ");
        System.out.println("Sale Amount: ₹" + amount);
        System.out.println("Sale completed successfully!");
    }

    public void generateInvoice(String client, double amount) {
        clientName = client;
        System.out.println("\n Finance Department ");
        System.out.println("Client Name: " + client);
        System.out.println("Invoice Amount: ₹" + amount);
        System.out.println("Invoice generated successfully");
    }


    void showSummary() {
        System.out.println("\n Summary");
        System.out.println("Client: " + clientName);
        System.out.println("Total Sale: ₹" + saleAmount);
        System.out.println("All commercial tasks completed");
    }
}

public class Main {
    public static void main(String[] args) {

        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(75000);
        exec.generateInvoice("AAA Pvt Ltd", 75000);
        exec.showSummary();
    }
}