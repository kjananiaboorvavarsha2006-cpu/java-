/*Q6: Collatz Sequence [Medium]

A Collatz sequence starts with any positive integer and applies a simple rule: 
if the number is even, divide it by 2; if it's odd, multiply it by 3 and add 1. 
The process is then repeated with the resulting number as 1
- Input: 26
Output: 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
- Input: 5
Output: 5, 16, 8, 4, 2, 1*/
import java.util.Scanner;

public class Collatz_Sequence{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         System.err.print("Enter the number: ");
         int num=scr.nextInt();
       System.out.println("collatz sequence: ");
         while(num!=1){
            System.out.print(num+",");
         if(num%2==0){
         num/=2;
         }
         else {
            num=num*3+1;
         }
         }
        System.out.print(1);
    }
}