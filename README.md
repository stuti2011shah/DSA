Here's the revised README file without the output section:

---

# CollegePortal Java Program

## 📚 Overview

The `CollegePortal` Java program simulates a college portal where you can manage students and courses. It provides functionalities to create students, sort them by student ID using the Quick Sort algorithm, and enroll them in a course.

## 🚀 Features

- **Student Management:** Create and manage student profiles with attributes like student ID, name, age, and CGPA.
- **Course Management:** Create courses and enroll students.
- **Sorting:** Sort students by their student ID using Quick Sort.
- **Enrollment:** Automatically enroll students in a course based on availability.

## 🛠️ Class Descriptions

### 1. `Student` Class

This class represents a student with the following properties:

- `int studentId`: Unique ID of the student.
- `String name`: Name of the student.
- `int age`: Age of the student.
- `double cgpa`: CGPA of the student.

**Methods:**

- `int getStudentId()`: Returns the student ID.
- `String getName()`: Returns the student's name.
- `int getAge()`: Returns the student's age.
- `double getCgpa()`: Returns the student's CGPA.

### 2. `Course` Class

This class represents a course with the following properties:

- `String courseCode`: Unique code for the course.
- `String name`: Name of the course.
- `String professor`: Professor teaching the course.
- `int capacity`: Maximum number of students that can enroll.
- `ArrayList<Student> students`: List of students enrolled in the course.

**Methods:**

- `boolean enrollStudent(Student student)`: Enrolls a student if capacity is not exceeded.
- `ArrayList<Student> getStudents()`: Returns the list of enrolled students.

### 3. `CollegePortal` Class

The main class that drives the program. It handles:

- Student creation and input.
- Addition of predefined students.
- Sorting of students by ID using Quick Sort.
- Course creation and student enrollment.
- Display of student and enrollment information.

**Methods:**

- `static void quickSort(Student[] arr, int low, int high)`: Sorts an array of students by their ID using Quick Sort.
- `static int partition(Student[] arr, int low, int high)`: Partitions the array for Quick Sort.

## 📋 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/CollegePortal.git
   cd CollegePortal
   ```

2. **Compile the program:**
   ```bash
   javac CollegePortal.java
   ```

3. **Run the program:**
   ```bash
   java CollegePortal
   ```

4. **Input:** Provide details as prompted for additional students.

## 📂 Project Structure

- `CollegePortal.java`: The main Java file containing the entire program.

## 🛠️ Prerequisites

- Java Development Kit (JDK) installed on your system.

## 🤝 Contributing

Contributions are welcome! Please fork this repository and submit a pull request with your improvements.

## 🧾 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

For any questions or suggestions, feel free to reach out at [stuti2011shah@gmail.com](mailto:stuti2011shah@gmail.com).

