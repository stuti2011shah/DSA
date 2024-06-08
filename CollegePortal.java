import java.util.*;

// Defining a Student class to represent students
class Student {
    int studentId;
    String name;
    int age;
    double cgpa;

    // Constructor to initialize student properties
    Student(int studentId, String name, int age, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    // Getter methods for retrieving student properties
    int getStudentId() {
        return studentId;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getCgpa() {
        return cgpa;
    }
}

// Defining a Course class to represent courses
class Course {
    String courseCode;
    String name;
    String professor;
    int capacity;
    ArrayList<Student> students = new ArrayList<>();

    // Constructor to initialize course properties
    Course(String courseCode, String name, String professor) {
        this.courseCode = courseCode;
        this.name = name;
        this.professor = professor;
    }

    // Method to enroll a student in the course
    boolean enrollStudent(Student student) {
        if (students.size() < capacity) {
            students.add(student);
            return true;
        } else {
            return false;
        }
    }

    // Method to get the list of enrolled students
    ArrayList<Student> getStudents() {
        return students;
    }
}

class CollegePortal {

    // Method to perform quick sort on an array of students based on their IDs
    static void quickSort(Student[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array for quick sort
    static int partition(Student[] arr, int low, int high) {
        int pivot = arr[high].getStudentId();
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (arr[j].getStudentId() < pivot) {
                i++;
                // Swapping students
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }

        // Swapping the pivot with the correct position
        i++;
        Student temp = arr[i];
        arr[i] = arr[low];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pre-defined additional students
        Student[] additionalStudents = {
            new Student(101, "stuti", 20, 3.5),
            new Student(103, "shreya", 22, 3.9),
            new Student(102, "vishwa", 19, 3.8),
            new Student(105, "archi", 21, 3.6),
            new Student(104, "muskan", 20, 3.2)
        };

        // Input: Number of additional students
        System.out.print("Enter the number of additional students:");
        int studentsCount = scanner.nextInt();
        scanner.nextLine();
        int count=0; 
        // Array to store all students including additional ones
        Student[] students = new Student[studentsCount+5];
        for (int i = 0; i < studentsCount; i++) {
            // Input: Student details
            System.out.print("Enter student ID for student " + (i + 1) + ":");
            int studentId = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.print("Enter age for student " + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter CGPA for student " + (i + 1) + ":");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(studentId, name, age, cgpa);
            count++;
        }

        // Adding pre-defined additional students to the array
        for (int i = 0; i < additionalStudents.length; i++) {
               students[count]=additionalStudents[i];
               count++;
        }

        // Displaying unsorted students
        System.err.println();
        System.out.println("Unsorted students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId() + ", Age: " + student.getAge() + ", CGPA: " + student.getCgpa());
        }
        System.out.println();

        // Sorting students by ID using quick sort
        quickSort(students, 0, students.length - 1);

        // Displaying sorted students
        System.out.println("Sorted students by ID:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId() + ", Age: " + student.getAge() + ", CGPA: " + student.getCgpa());
        }
        System.out.println();

        // Creating a course
        Course course = new Course("CS101", "Introduction to Computer Science", "Dr. Smit");
        course.capacity = 3;

        // Enrolling students in the course
        for (int i = 0; i < 3; i++) {
            course.enrollStudent(students[i]);
        }

        // Displaying enrolled students in the course
        System.out.println("Enrolled students:");
        for (Student student : course.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId() + ", Age: " + student.getAge() + ", CGPA: " + student.getCgpa()+", Course Name: "+course.name);
        }
        scanner.close();
    }
}
