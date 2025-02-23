class Student {
    // Instance variables (fields)
    String firstName;
    String lastName;
    String major;
    double gpa;
    int age;
    boolean onProbation;

    // Constructor to initialize a Student object
    public Student(String firstName, String lastName, String major, double gpa, int age, boolean onProbation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.age = age;
        this.onProbation = onProbation;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);
        System.out.println("On Probation: " + onProbation);
    }
}

public class App {
    public static void main(String[] args) {
        // Create a new Student object using the constructor with parameters
        Student myStudent = new Student("Eric", "Yang", "Computer Science", 2.4, 29, false);

        // Display the student details (no need to assign values again)
        myStudent.displayDetails();
    }
}
