import java.util.Scanner;
public class StarsTriangle {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n:");
        int n=scanner.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
        System.out.println();    
        }
        scanner.close();
    }
}