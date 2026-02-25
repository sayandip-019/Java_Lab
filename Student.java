class Student{
    String name;
    int roll;
Student(String s, int r){
        name = s;
        roll = r;
    }
void display(){
    System.out.println(name + " " + roll);
    }
public static void main(String[] args) {
    Student s1 = new Student("Sayandip", 82);
    s1.display();
    }
}