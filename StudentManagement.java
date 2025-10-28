import java.util.*;

class Student {
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent(sc);
                case 2 -> viewStudents();
                case 3 -> deleteStudent(sc);
                case 4 -> System.out.println("Exiting");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(roll, name, marks));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\nStudent List");
        for (Student s : students) {
            System.out.println("Roll: " + s.roll + " | Name: " + s.name + " | Marks: " + s.marks);
        }
    }

    static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();
        boolean found = students.removeIf(s -> s.roll == roll);
        if (found)
            System.out.println("Student deleted");
        else
            System.out.println("Roll number not found.");
    }
}
