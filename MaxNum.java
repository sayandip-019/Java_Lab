class MaxNum{
    int a,b,c;
    MaxNum(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    void findMax(){
        if(a>b && a>c)
            System.out.println("Max is " + a);
        else if(b>a && b>c)
            System.out.println("Max is " + b);
        else
            System.out.println("Max is " + c);
    }
    public static void main(String args[]){
        MaxNum obj = new MaxNum(16,29,10);
        obj.findMax();
    }
}