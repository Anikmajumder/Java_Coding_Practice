
public class Teacher {

    String name, gender;
    int phone;

    
    Teacher(){
        System.out.println("no value");
    }
    
    Teacher(String name, String gender){
        this.name = name;
        this.gender = gender;
        
     }
 
    Teacher(String name, String gender, int phone){
        this(name,gender);
        this.phone = phone;
    }

    

    int square(int a){
        return a*a;
    }

    void disInformation(){
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("Phone "+phone);
        System.out.println("\n\n");
    }
    
}
