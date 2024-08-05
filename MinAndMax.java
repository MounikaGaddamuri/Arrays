import java.util.*;
public class MinAndMax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<array_size;i++){
            if(array[i]<min)    min=array[i];
            if(array[i]>max)    max=array[i];
        }
        System.out.println("Minimum element: "+min);
        System.out.println("Maximum element: "+max);
    }
}
