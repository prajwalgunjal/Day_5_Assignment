package bridgelabz.com.BasicCoreProgram;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till that you want to print the table of 2");
        int power = sc.nextInt();
        for(int i=0 ;i<=power;i++)
        {
            int ans=2*i;
            System.out.println("2^"+i+ "=" +ans);
        }
    }
}
