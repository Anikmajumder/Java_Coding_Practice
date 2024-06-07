package LinkLIst;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {


        HashSet<String> fruit = new HashSet<>();

        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Straberry");

        System.out.println(fruit);
        System.out.println(fruit.size());

        fruit.remove("Apple");
        System.out.println(fruit);
        fruit.clear();
        System.out.println(fruit);
        boolean value = fruit.isEmpty();
        System.out.println(value);



    }
    
}
