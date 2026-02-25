class Swap{
    int num;
Swap(int n){
        num = n;
    }
void swap(Swap obj){
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }
void display(){
        System.out.println(num);
    }
public static void main(String args[]){
        Swap obj1 = new Swap(3);
        Swap obj2 = new Swap(6);
        System.out.println("Before Swap:");
        obj1.display();
        obj2.display();
        obj1.swap(obj2);
        System.out.println("After Swap:");
        obj1.display();
        obj2.display();
    }
}