public class methodOver {

    void add(int a, int b){
            System.out.println(a+b);
    }

    void add(double a, double b){

        System.out.println(a+b);
}

void add(int a, int b,int c){
    System.out.println(a+b+c);
}
    public static void main(String[] args){
methodOver ob1 = new methodOver();
ob1.add(1.3,2.3);
        
ob1.add(1,2);
ob1.add(1,2,3);
    }
}
