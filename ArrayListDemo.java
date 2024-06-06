import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListDemo {

public static void main(String[] args) {

    // ArrayList<Integer> number = new ArrayList<Integer>();
    // System.out.println("Size = "+number.size());

    // number.add(10);
    // number.add(20);
    // number.add(30);
    // number.add(0,40);
    
    
    // for(int x:number){
    //     System.out.print(" "+x);
    // }
    
    
    // Iterator itr = number.iterator();
    // while (itr.hasNext()) {
    //     System.out.println(" "+itr.next());
    //     }
    
    // for (int i: number){
    //     System.out.println(i+" ");
    // }

    //number.remove(2);
    //number.removeAll(number);
    //number.clear();
   

    // System.out.println("ArrayList contains: "+number);
    // System.out.println();
    // System.out.println("After removing Size = "+number.size());


    // boolean check = number.isEmpty();
    // System.out.println("arraylist empty: "+check);

    // boolean contain = number.contains(30);
    // System.out.println("30 is in the list: "+contain);

    // int pos = number.indexOf(20);
    // System.out.println("index of 20 is : "+pos);

    // number.set(2, 50);
    // System.out.println("After setting/replacing :  "+number);

    // int x = number.get(2);
    // System.out.println("index 2 = "+x);




/*  ArrayList<Integer> number1 = new ArrayList<>();
    ArrayList<Integer> number2 = new ArrayList<>();
    ArrayList<Integer> number3 = new ArrayList<>();

    number1.add(10);
    number1.add(20);
    number1.add(30);
    number1.add(40);
    System.out.println("Number 1 = "+number1);

    number2.add(1);
    number2.add(2);
    number2.add(3);
    number2.add(4);
    System.out.println("Number 2 = "+number2);

    number3.addAll(number1);
    System.out.println("Number 3 = "+number3);


    boolean x = number1.equals(number2);
    System.out.println(x);
    */
   

    ArrayList<Integer> number = new ArrayList<Integer>();
    
    number.add(10);
    number.add(-20);
    number.add(0);
    number.add(2);

    System.out.println("before sorting : "+number);

    Collections.sort(number);
    System.out.println("after sorting in ascending: "+number);

    Collections.sort(number,Collections.reverseOrder());
    System.out.println("after sorting in descending: "+number);

    
}
}
