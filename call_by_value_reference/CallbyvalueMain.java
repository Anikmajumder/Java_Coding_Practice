package call_by_value_reference;

public class CallbyvalueMain {
    public static void main(String[] args){

        Callbyvalue ob = new Callbyvalue();
        int x = 10;
        System.out.println("X before call: "+x);

        ob.change(x);
        System.out.println("X after call: "+x);

    }
}
