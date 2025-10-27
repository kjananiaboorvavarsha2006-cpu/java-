/*Q10: Reverse a Number [Easy]
- Input: 1234
Output: 4321
- Input: 560
Output: 65*/
import java.util.Scanner;
public class reverse{
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

        System.out.println("Reverse = " + rev);
    }
}