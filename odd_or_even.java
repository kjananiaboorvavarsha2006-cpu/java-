import java.util.Scanner;
public class odd_or_even{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scr.nextInt();
        
        if(num%2==0)
        {
         System.out.println("The given Number is even!");
        }
        else
        {
            System.out.println("The Given Number is odd");
        }
    }
}