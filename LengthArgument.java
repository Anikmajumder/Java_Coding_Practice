public class LengthArgument {
    
    void add(int ... num){
        int sum = 0;
        for (int x: num){
            sum = sum +x;

        }
        System.out.println(sum);

    }


    public static void main(String[] args){
        LengthArgument ob = new LengthArgument();
        ob.add(1,2,3,4,5,6);
    }
}
