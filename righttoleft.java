
import java.util.Scanner;

/*Q1: Print Digits (Right to Left) [Easy]
- Input: 1234
Output: 4 3 2 1
- Input: 1001
Output: 1 0 0 1*/
public class righttoleft{
    public static void main(String[] args) {
      Scanner scr=new Scanner(System.in);
       System.out.print("Enter the number");
       int num=scr.nextInt();
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Right to left = " + rev);
    }
}