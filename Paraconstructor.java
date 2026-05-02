public class Paraconstructor {

    int num;

  
    Paraconstructor(int n) {
        num = n;
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) {
        Paraconstructor obj = new Paraconstructor(50);
    }
}