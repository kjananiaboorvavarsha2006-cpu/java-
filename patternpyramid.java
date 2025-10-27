
import java.util.Scanner;

public class patternpyramid{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scr.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++)
                {
                System.out.print("*");
                }
                System.out.println(" ");
            
        }
    }
}
