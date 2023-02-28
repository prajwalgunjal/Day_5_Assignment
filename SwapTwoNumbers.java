package bridgelabz.com.BasicCoreProgram;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int firstnumber = sc.nextInt();
        System.out.println("Enter second number:- ");
        int secondnumber = sc.nextInt();

        System.out.println("*****************************");
        System.out.println("before sorting ");
        System.out.println("First number is " +firstnumber);
        System.out.println("Sencond number is " +secondnumber);
        System.out.println("******************************");
        System.out.println("after sorting");
        int temp = firstnumber;
        firstnumber=secondnumber;
        secondnumber=temp;
        System.out.println("first number after sorting is  " +firstnumber);
        System.out.println("Second number after sorting is " +secondnumber);

    }
}
