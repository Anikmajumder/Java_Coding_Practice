import java.util.ArrayList;
import java.util.List;

import Interface.Multiple_inheritance.C;

public class GenericExample {
    public static void main(String[] args) {
        
        // Printer<Integer> printer = new Printer<>(23);
        // printer.print();

        // Printer<Double> doublPrinter = new Printer<>(33.45);
        // doublPrinter.print();

        

        // Printer<Cat> printer = new Printer<>(new Cat());
        // printer.print();

        // Printer<Dog> doubleprinter = new Printer<>(new Dog());
    
        // ArrayList<Cat> cats = new ArrayList<>();
        // cats.add(new Cat());
        // Cat myCat = cats.get(0);




        //shout("john", 74);
        //shout(57);
        //shout(new Cat());
        

        // List<Integer> intList = new ArrayList<>();
        // intList.add(3);
        // printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

        
    }

    //Generic Method

    // private static <T> void shout( T thigToShout){
    //     System.out.println(thigToShout + "!!!");
    // }


    // private static <T, V> T shout( T thigToShout, V otherthigToShout){
    //     System.out.println(thigToShout + "!!!");
    //     System.out.println(otherthigToShout + "!!!");

    //     return thigToShout;
    // }


    // wildcard

    private static void printList(List<? extends Animal> myList){
        System.out.println();
    }


}
