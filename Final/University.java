package Final;

public class University {

    final String name= "Aiub";
    static final int fee;//staic blank final variable

    static(){
        fee = 17000;
    }

    void display(){
        
        System.out.println(name);
        System.out.println(fee);
    }
    
}
