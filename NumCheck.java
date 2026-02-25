class NumCheck {

    int n;

    NumCheck(int x){
        n = x;
    }

    void show(){
        if(n>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public static void main(String args[]){
        NumCheck obj = new NumCheck(9);
        obj.show();
    }
}