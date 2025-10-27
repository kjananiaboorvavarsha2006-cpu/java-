/*Q4: Sum of Digits [Easy]
- Input: 123
Output: 6
- Input: 405
Output: 9*/
import java.util.Scanner;
public class sumdigit{
    public static void main(String[] args) {
       Scanner scr=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n=scr.nextInt();
       int sum=0;
       int dig=0;
       while(n>0){
        dig=n%10;
        sum=sum+dig;
        n=n/10;
       } 
System.out.println("The sum of digit is "+sum);
    }
}