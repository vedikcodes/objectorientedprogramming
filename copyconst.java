public class copyconst {
    public static void main(String[]args){
        Student1 s1 = new Student1();
        s1.name="vedik";
        s1.roll=456;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student1 s2 = new Student1(s1);
        s2.password="xyz";
        for(int i=0 ;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }

}

public class Student1 {
    String name;
    int roll;
    String password;
    int marks[];
    Student(Student1 s1){ //copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks=s1.marks;
    }
    Student1(){
        marks= new int[3];
        System.out.println("constructor is called...");
    }
    Student1(String name){
        marks= new int[3];
        this.name =name;
    }
    Student1(int roll){
        marks =new int[3];
        this.roll=roll;
    }
}
