package LinkLIst;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        //student linklist
        LinkedList<Student> list = new LinkedList<>();
        
        //student create
        Student s1 = new Student(12,"Karim","eleven");
        Student s2 = new Student(13,"Rahim","eleven");
        Student s3 = new Student(14,"Pasa","eleven");
        Student s4 = new Student(15,"Kabila","eleven");

        //Student add to the student list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //information display
        for(Student s: list){
            System.out.println(s.id+" , "+s.name+" , "+s.className);
        }



    }
}
