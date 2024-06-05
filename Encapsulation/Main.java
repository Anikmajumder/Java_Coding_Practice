package Encapsulation;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Anik");
        System.out.println(p1.getName());
        p1.setAge(26);
        System.out.println(p1.getAge()); 
    }
}
