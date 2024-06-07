package LinkLIst;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("India");
        countryNames.add("Bangladesh");
        countryNames.add("China");
        countryNames.add("Srilanka");

        // countryNames.remove("China");
        // countryNames.remove(1);

        // countryNames.removeLast();
        // countryNames.removeFirst();

        for(String country: countryNames){
            System.out.println(country);
        }


        System.out.println("Size of the LinkedList: "+countryNames);
        System.out.println("first element: "+countryNames.getFirst());
        System.out.println("Last element: "+countryNames.getLast());

        countryNames.clear();
        System.out.println(countryNames);
    
    }   
}
