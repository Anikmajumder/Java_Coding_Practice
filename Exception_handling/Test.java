package Exception_handling;

public class Test {
    
    public static void main(String[] args) {
        
        // try{
        //     int x = 10;
        //     int y = 0;
        //     int result = x/y;
    
        //     System.out.println("Result: "+result);
        // } catch(Exception e){
        //     System.out.println("Exception : "+e);
        // }
        
        //     System.out.println("Last line of the program");
        

            // 
            

            try{
                int [] a = new int[4];
                a[4] = 10;
        
            } catch(ArrayIndexOutOfBoundsException e1){
                System.out.println("Exception : "+e1);
            }catch(Exception e2){
                System.out.println("Exception : "+e2);
            }
            finally{
                System.out.println("Last line of the program");
            }

        
        
    
    }
}
