package Type_Casting;

public class Test {
    public static void main(String[] args) {
        

        Person p = new Teacher();// upcasting
        p.display();

        // Teacher t = (Teacher) new Person();// error not allowed in when program run
        // t.display();




        // double y = 10.5;
        // int x =(int) y;
        // System.out.println(x);
    }
}
