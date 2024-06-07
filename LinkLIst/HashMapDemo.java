package LinkLIst;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //put, get
        HashMap<Integer, String> customer = new HashMap<>();

        customer.put(101, "Anik");
        customer.put(102, "Ashin");
        customer.put(103, "Anil");

        System.out.println(customer.get(102));
        System.out.println(customer.get(101));
        System.out.println(customer.get(103));
    }
}
