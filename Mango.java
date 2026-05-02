
interface Mango {
    void showTaste();
}

class Winter implements Mango {
    public void showTaste() {
        System.out.println("Winter Mango: Rare and less sweet.");
    }
}

class Summer implements Mango {
    public void showTaste() {
        System.out.println("Summer Mango: Juicy, sweet, and delicious!");
    }
}

public class Main {
    public static void main(String[] args) {

        Mango m;

      
        m = new Winter();
        m.showTaste();


        m = new Summer();
        m.showTaste();
    }
}