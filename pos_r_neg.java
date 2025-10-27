
/*Q2. Positive / Negative (Easy)
Write a program to check whether a number is Positive, Negative, or Zero.
Input format :
The input consists of an integer.
Output format :
The output prints whether the number is "Positive", "Negative" or "Zero".
Sample test cases :
Input :
5
Output :
Positive
Input :
-3
Output :
Negative
Input :
0
Output :
Zero*/
import java.util.Scanner;
public class pos_r_neg{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=scr.nextInt();
        if(a>0)
        System.out.println("positive");
      else
      if(a<0)
        System.out.println("negative");
    else
       System.out.println("The given number is 0");

       
    }
}