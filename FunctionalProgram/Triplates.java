package bridgelabz.com.BasicCoreProgram.FunctionalProgram;
import java.util.Scanner;
public class Triplates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of array ");
        int[] arr = new int[5];
        boolean flag = false;
        for(int i=0;i<arr.length;i++)
        {
            int a = sc.nextInt();
            arr[i]=a;
        }
//        for(int i=0;i< arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
            for(int i = 0;i<arr.length;i++)
            {
                for(int j=i+1;j< arr.length;j++)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        if(arr[i]+arr[j]+arr[k]==0)
                        {
                            System.out.println(arr[i]+" " + arr[j] + " " +arr[k]);
                            flag=true;
                        }

                    }
                }
            }
            if (flag == false){
                System.out.println("Not exist !!!!");
            }
    }
}
