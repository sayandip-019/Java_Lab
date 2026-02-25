public class Reverse{
    public static void main(String[] args){
        int n = 641295;
        int r = 0;
        while (n != 0){
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        System.out.println(r);
    }
}