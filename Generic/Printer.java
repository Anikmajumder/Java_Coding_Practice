import java.io.Serializable;

//public class Printer <T extends Animal & Serializable>{
// public class Printer <T, V>{

//     T thingToPrint;
//     V otherThing;
public class Printer <T extends Animal & Serializable>{
    
    T thingToPrint;
    public Printer(T thigToPrint){
        this.thingToPrint = thigToPrint;
    }

    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
    
}
