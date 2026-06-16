import java.util.*;

// Custom exception for student not found
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// Student class containing all student information
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

// Main class
public class StudentManagementSystem {

    // Method to search student by ID
    public static Student searchStudentById(Student[] students, int searchId) throws StudentNotFoundException {
        for (Student student : students) {
            if (student != null && student.getId() == searchId) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with ID " + searchId + " not found!");
    }

    // Method to display all students
    public static void displayAllStudents(Student[] students) {
        System.out.println("\n========== ALL STUDENTS ==========");
        boolean hasStudents = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Cell " + i + ": " + students[i]);
                hasStudents = true;
            }
        }
        if (!hasStudents) {
            System.out.println("No students found in the array.");
        }
        System.out.println("==================================\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create student array of size 5
        Student[] students = new Student[5];

        // Store student objects in each cell
        // Each cell contains a complete Student object with id, name, age
        students[0] = new Student(101, "Jony Sins", 20);
        students[1] = new Student(102, "Mia Kalifa", 21);
        students[2] = new Student(103, "Dinesh Saravanan", 22);
        students[3] = new Student(104, "Harish ram", 19);
        students[4] = new Student(105, "Rome", 23);

        // Display all students
        displayAllStudents(students);

        // Search for student by ID
        System.out.print("Enter student ID to search: ");
        int searchId = scanner.nextInt();

        try {
            Student foundStudent = searchStudentById(students, searchId);
            System.out.println("\n✅ Student found!");
            foundStudent.displayStudent();
        } catch (StudentNotFoundException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
        }

        // Additional example: Try searching for a non-existent ID
        System.out.println("\n--- Testing with non-existent ID ---");
        System.out.print("Enter another student ID to search: ");
        int anotherId = scanner.nextInt();

        try {
            Student foundStudent = searchStudentById(students, anotherId);
            System.out.println("\n✅ Student found!");
            foundStudent.displayStudent();
        } catch (StudentNotFoundException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
        }

        scanner.close();
    }
}