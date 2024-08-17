import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first array elements: ");
        int[][] array1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the second array elements: ");
        int[][] array2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array2[i][j] = input.nextInt();
            }
        }

        int[][] array3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Addition of the two matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
