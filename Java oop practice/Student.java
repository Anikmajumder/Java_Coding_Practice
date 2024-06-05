public class Student {

    String name;
    String gender;
    static String uni="AIUB";

    Student( String n, String g){
        name = n;
        gender = g;
    }
    void disInformation(){
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("University "+uni);
        System.out.println("\n\n");
    }
    
}
