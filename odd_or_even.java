/*Q1. Even / Odd (Easy)
Write a program to check whether a number is Even or Odd.
Input format :
The input consists of an integer.
Output format :
The output prints "Even" or "Odd".
Sample test cases :
Input :
4
Output :
Even
Input :
7
Output :
Odd*/
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