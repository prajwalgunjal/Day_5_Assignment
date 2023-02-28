package bridgelabz.com.BasicCoreProgram;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check weather it is vowel or consonant");
        String str = sc.next();
        if(str == "a" || str == "e" || str=="i"||str== "o"|| str=="u"){
            System.out.println("Its vowel");
        }
        else {
            System.out.println("it is consonant ");
        }
    }
}
