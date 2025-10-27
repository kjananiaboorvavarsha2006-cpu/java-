
import java.util.Scanner;

/*Q20. Count Digits (Easy)
Count the number of digits in a number.
Input format :
An integer.
Output format :
Digit count.
Sample test cases :
Input :
98765
Output :
5**/
public class count{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =scr.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}