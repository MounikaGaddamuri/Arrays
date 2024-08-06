import java.util.*;
public class EvenAndOddCount
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");;
		int array_size=input.nextInt();
		int[] array=new int[array_size];
		int evenCount=0,oddCount=0;
		System.out.println("Enter the array elements: ");
		for(int i=0;i<array_size;i++){
		    array[i]=input.nextInt();
		    if(array[i]%2==0)   evenCount++;
		    else    oddCount++;
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
	}
}
