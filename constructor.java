public class constructor {
    public static void main(String[]args){
        Stud s1 = new Stud("vedik");
        System.out.println("name :" + s1.name);
    }
}

class Stud {
    String name;
    int roll;
     Stud(String name) {
         this.name=name;
     }

}
