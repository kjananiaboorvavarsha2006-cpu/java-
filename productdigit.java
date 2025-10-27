/*Q19: Product of Digits [Easy]
- Input: 123
Output: 6
- Input: 405
Output: 0*/
import java.util.Scanner;
public class productdigit{
    public static void main(String[] args) {
       Scanner scr=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n=scr.nextInt();
       int pro=1;
       int dig=0;
       while(n>0){
        dig=n%10;
        pro=pro*dig;
        n=n/10;
       } 
System.out.println("The product of digit is "+pro);
    }
}