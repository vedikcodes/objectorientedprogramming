public class GetnSet {
    public static void main(String[] args) {
        // Create a new GetnSet object
        GetnSet person = new GetnSet();

        // Set the values using setters
        person.setName("John Doe");
        person.setAge(30);

        // Get the values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    // Private fields
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        if (age > 0) { // Adding a simple validation
            this.age = age;
        }
    }
}
