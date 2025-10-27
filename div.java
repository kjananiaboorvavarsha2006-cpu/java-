/*Q3. Divisible by 3 and 5 (Easy)
Check whether the given number is divisible by both 3 and 5.
Input format :
The input consists of an integer.
Output format :
The output prints "Yes" if divisible, otherwise "No".
Sample test cases :
Input :
15
Output :
Yes
Input :
7
Output :
No*/
import java.util.Scanner;
public class div{
    public static void main(String[]args){
        Scanner scr=new Scanner (System.in);
        System.out.print("Enter the number:");
        int num=scr.nextInt();
        if(num%3==0 && num%5==0)
        System.out.println("The given number is divisible");
        else
        System.out.println("The given number is not divisible");
    }
}