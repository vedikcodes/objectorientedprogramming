public class AccessModifierDemo {

    private String privateData = "Private Data";
    String defaultData = "Default Data";
    protected String protectedData = "Protected Data";
    public String publicData = "Public Data";

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();

        // Accessing all data members within the same class
        System.out.println(demo.privateData); //accessible
        System.out.println(demo.defaultData); //accessible
        System.out.println(demo.protectedData); //accessible
        System.out.println(demo.publicData);//accessible

        // Creating SubClassDemo object to access protected and public data
        SubClassDemo subclassDemo = new SubClassDemo();
        subclassDemo.display();

        // Creating Test object to access public data
        Test test = new Test();
        test.testAccess();
    }
}

class SubClassDemo extends AccessModifierDemo {

    public void display() {
        // System.out.println(privateData); // Not accessible
        // System.out.println(defaultData); // Not accessible
        System.out.println(protectedData); // Accessible
        System.out.println(publicData); // Accessible
    }
}

class Test {
    public void testAccess() {
        AccessModifierDemo demo = new AccessModifierDemo();
        // System.out.println(demo.privateData); // Not accessible
        // System.out.println(demo.defaultData); // Not accessible
        // System.out.println(demo.protectedData); // Not accessible
        System.out.println(demo.publicData); // Accessible
    }
}

