/**
 * A simple Java program to demonstrate code quality for static analysis.
 */
public class StudentSystem {

    private String studentName;
    private int studentId;

    // Constructor
    public StudentSystem(String name, int id) {
        this.studentName = name;
        this.studentId = id;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        // Creating an object of StudentSystem
        StudentSystem student = new StudentSystem("Ali", 101);
        student.displayInfo();
    }
}