package Method_overridding;

public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher();
        t.name = "anik";
        t.age = 26;
        t.qualification = "bsc in cse";

        t.displayInformation();
        

        Person p = new Person();
        p.name = "Bendo";
        p.age = 24;
        
        p.displayInformation();
}
}