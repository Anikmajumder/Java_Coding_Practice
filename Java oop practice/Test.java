
public class Test {

     public static void main(String[] args){
        Teacher teacher1 = new Teacher("anisul", "male", 012233445);;
        teacher1.disInformation();

        Teacher teacher2 = new Teacher("abul", "male");;
        teacher2.disInformation();

        Teacher teacher3 = new Teacher("lisa","female",543454345);
        teacher3.disInformation();


        Teacher obj = new Teacher();
        System.out.println(obj.square(5));
     }
}