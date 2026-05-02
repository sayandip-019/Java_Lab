import java.util.*;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";

    void printDeptDetails();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Location: " + hostelLocation);
        System.out.println("Rooms: " + numberOfRooms);
    }
}


class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration No: ");
        regdNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective: " + electiveSubject);
        System.out.println("Avg Marks: " + avgMarks);

        printHostelData();
        printDeptDetails();
    }

  
    public void printDeptDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("Dept Head: " + deptHead);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Admit New Student");
            System.out.println("2. Migrate Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    list.add(s);
                    break;

                case 2:
                    System.out.print("Enter Regd No to migrate: ");
                    int r = sc.nextInt();
                    boolean found = false;

                    for (Student st : list) {
                        if (st.regdNo == r) {
                            System.out.print("Enter New Hostel Name: ");
                            sc.nextLine();
                            st.hostelName = sc.nextLine();
                            System.out.print("Enter New Location: ");
                            st.hostelLocation = sc.nextLine();
                            found = true;
                            System.out.println("Migration Done!");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found!");
                    break;

                case 3:
                    for (Student st : list) {
                        st.printData();
                    }
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}