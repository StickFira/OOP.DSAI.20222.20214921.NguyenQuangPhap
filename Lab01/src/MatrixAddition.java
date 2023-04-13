import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int column=scanner.nextInt();
        //Initialize Matrix1
        System.out.println("Input first matrix: ");
        int[][] matrix1=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix1[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Input second matrix: ");
        int[][] matrix2=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix2[i][j]= scanner.nextInt();
            }
        }
        int[][] SumMatrix=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                SumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(SumMatrix[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
}}
