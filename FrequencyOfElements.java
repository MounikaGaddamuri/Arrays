import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array_size; i++)
            array[i] = input.nextInt();
        int count = 0, k = -1;
        for (int i = 0; i < array_size; i++) {
            count = 1;
            for (int j = i + 1; j < array_size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = k;
                }
            }
            if (array[i] != -1)
                System.out.println(array[i] + "->" + count);
        }
    }
}
