package bridgelabz.com.BasicCoreProgram.FunctionalProgram;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] [] = new int[3][3];
        System.out.println("Enter the elelment of array :- ");

        for (int i=0;i< arr.length;i++)
            for(int j=0;j<arr.length;j++)
            {
                System.out.println("ENter the element of array :- ");
                arr[i][j]=sc.nextInt();
            }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("\n");
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j] +"\t");
            }
        }
    }
}