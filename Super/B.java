package Super;

public class B extends A {
    
    int gear;

    B(String c, double w, int g){
        super(c,w);
        gear = g;
        
    } 

    @Override
    void display(){
        super.display();
        System.out.println("The gear is: "+gear);
    }
    
    
    
    
    
    
    /*@Override
    void display(){
        super.display();
        System.out.println("it is inside B class");
    }*/
    
    
    /*int x = 10;

    void display(){
        System.out.println(super.x);
    }*/
}
