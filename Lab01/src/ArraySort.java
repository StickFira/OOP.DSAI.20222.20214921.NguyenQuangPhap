import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Size of array: ");
        int size=scanner.nextInt();

        int[] array= new int[size];
        for (int i=0; i<size; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Array before sorted: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sorted: " + Arrays.toString(array));
        int sum=0;
        for (int i=0;i<size;i++){
            sum+=array[i];
        
        }
        double average=(double) sum/size;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        scanner.close();
    }
}