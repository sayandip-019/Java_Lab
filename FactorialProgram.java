class FactorialProgram {
    int factorial(int num) {
        int fact = 1;
for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
public static void main(String[] args) {
        FactorialProgram obj = new FactorialProgram();
        int number = 4;
        int result = obj.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}