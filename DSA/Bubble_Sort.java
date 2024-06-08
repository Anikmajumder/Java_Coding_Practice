package DSA;

public class Bubble_Sort {
    
    public static void main(String[] args) {

        int[] my_array = {54,33,11,12,14};
        int size = my_array.length;
        int temp = 0;
        boolean swapped = false;

        System.out.println("Before sorting:");

        for( int nums: my_array){
            System.out.print(nums + " ");
        }

        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1;j++){
                if(my_array[j]>my_array[j+1]){
                    temp = my_array[j];
                    my_array[j] = my_array[j+1];
                    my_array[j+1]=temp;

                    swapped = true;
                }
            }

            if(!swapped) break;// for more efficient time complexity

            System.out.println();
            for(int nums: my_array){
                System.out.print(nums + " ");
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for(int nums: my_array){
            System.out.print(nums + " ");
        }

    }
}
