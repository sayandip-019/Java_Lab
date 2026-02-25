class OuterClass{
int number = 30;
class InnerClass{
        void display(){
            System.out.println("Value from outer class: " + number);
        }
    }
public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}