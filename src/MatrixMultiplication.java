import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix 1:");
        int rows1=input.nextInt();
        int columns1=input.nextInt();
        int[][] matrix1 = new int[rows1][columns1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                matrix1[i][j]=input.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for matrix 2:");
        int rows2=input.nextInt();
        int columns2=input.nextInt();
        int[][] matrix2 = new int[rows2][columns2];
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                matrix2[i][j]=input.nextInt();
            }
        }

        if(matrix1[0].length != matrix2.length)
            System.out.println("Matrix multiplication is not possible.");

        int[][] result=new int[rows1][columns2];

        for(int i=0;i< matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                result[i][j]=0;
                for(int k=0;k<matrix1[0].length;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
}