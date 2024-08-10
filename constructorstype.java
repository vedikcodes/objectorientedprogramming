class Student {
    // Fields
    private String name;
    private int grade;

    // Non-parameterized constructor (No-argument constructor)
    public Student() {
        this.name = "Unknown";
        this.grade = 0;
    }

    // Parameterized constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.grade = student.grade;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

// Driver class
 class Constructorstype {
    public static void main(String[] args) {
        // Creating an object using the non-parameterized constructor
        Student student1 = new Student();
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student("Vedik Tiwari", 90);
        student2.display();

        // Creating a copy of student2 using the copy constructor
        Student student3 = new Student(student2);
        student3.display();

        // Modifying the copied object
        student3.setName("Rohan Sharma");
        student3.setGrade(85);
        student3.display();

        // Displaying the original object to show it remains unchanged
        student2.display();
    }
}
