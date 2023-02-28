package bridgelabz.com.BasicCoreProgram;
import java.util.Scanner;
public class LargeFromThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter values of A,B,C");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+ "is a biggest number ");
        } else if (b>a && b>c) {
            System.out.println(b+ " is a biggest number");
        }
        else{
            System.out.println(c+ "is a biggest number");
        }
    }
}
