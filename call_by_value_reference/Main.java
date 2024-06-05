
public class Main {
    public static void main(String[] args){
        Callbyreference obj = new Callbyreference();
        obj.name = "anik";
        System.out.println("before change:  "+obj.name);

        
        obj.change(obj);
        System.out.println("after change: " +obj.name);





        Callbyvalue ob = new Callbyvalue();
        int x = 10;
        System.out.println("X before call: "+x);

        ob.change(x);
        System.out.println("X after call: "+x);

    }
}
