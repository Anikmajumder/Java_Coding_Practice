public class Constractor{

    int modelYear;
    String modelName;

    public Constractor(int year, String name){
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args){
        
        Constractor myObj = new Constractor(1964,"Mr. Bendo");
        System.out.println(myObj.modelYear+" "+myObj.modelName);
    }
}
