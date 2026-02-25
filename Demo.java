class Demo{
    int x;
Demo(){
    x = 0;
    System.out.println("Default:" + x);
    }
Demo(int val){
        x = val;
        System.out.println("Overloaded:" + x);
    }
public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(50);
        System.out.println("Value in obj1:" + obj1.x);
        System.out.println("Value in obj2:" + obj2.x);
    }
}