// Demonstrating encapsulation in Java
class Student {
    // Private fields to encapsulate the name and grade
    private String name;
    private int grade;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for grade
    public int getGrade() {
        return grade;
    }

    // Setter method for grade
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) { // Adding a simple validation
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }
}

// Driver class
class Encap {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();

        // Setting the name and grade using setter methods
        student.setName("Vedik Tiwari");
        student.setGrade(90);

        // Getting the name and grade using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}
