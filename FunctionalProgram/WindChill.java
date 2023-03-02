package bridgelabz.com.BasicCoreProgram.FunctionalProgram;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp");
        double t = sc.nextDouble();
        System.out.println("ENter wind ");
        double v = sc.nextDouble();
        double windChillTemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(windChillTemp);
    }
}