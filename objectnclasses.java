class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class objectnclasses {
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person1 = new Person("Alice", 30);

        // Accessing the object's method
        person1.displayDetails();
    }
}
