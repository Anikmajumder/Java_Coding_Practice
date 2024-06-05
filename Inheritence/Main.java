package Inheritence;

public class Main {
    public static void main(String[] args){
        Teacher t1 =  new Teacher();

        t1.name="alok kanti";
        t1.age=30;
        t1.setQualification("msc in cse");
        

        t1.displayInformation2();


        Teacher t2 =  new Teacher();

        t2.name="kanti";
        t2.age=35;
        t2.setQualification("msc in eee");

        t2.displayInformation2();
    }
}
