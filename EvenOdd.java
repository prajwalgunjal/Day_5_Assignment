package bridgelabz.com.BasicCoreProgram;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is even or odd");
        int checknumber = sc.nextInt();
        if (checknumber%2==0)
        {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd ");
        }
    }
}
