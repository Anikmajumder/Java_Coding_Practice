package Exception_handling;

import java.util.Scanner;

public class Exception_problem {
    public static void main(String[] args) {

        int count = 1;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter num1: ");
        
                int num1 = input.nextInt();
                System.out.println("Please enter num2: ");
                int num2 = input.nextInt();
                int result = num1/num2;
                System.out.println("Result: "+num1 +" / "+num2+" = "+result);
                count = 2;
                
            }catch(Exception e){
                System.out.println("Exception: "+e);
                System.out.println("Your must enter integer please try again");
            }
        }while(count == 1);
        
        
        
       


    }
}
