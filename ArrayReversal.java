import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array_size; i++)
            array[i] = input.nextInt();

        int start = 0, end = array_size - 1;
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < array_size; i++)
            System.out.print(array[i] + " ");
    }
}
