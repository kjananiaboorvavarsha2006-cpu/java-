
/*Q6. Max & Min of 2 Numbers (Easy)
Find the maximum and minimum of two numbers.
Input format :
Two integers separated by a space.
Output format :
Maximum and minimum value.
Sample test cases :
Input :
5 9
Output :
Max=9 Min=5
Input :
12 7
Output :
Max=12 Min=7*/
import java.util.Scanner;
public class minmax{
    public static void main(String[]args){
        Scanner scr=new Scanner (System.in);
        System.out.print("Enter the number:");
        int a=scr.nextInt();
        int b=scr.nextInt();
        if(a>b)
        System.out.println("max"+a);
        else
        System.out.println("min"+a);
        
    }
}