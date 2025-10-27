
import java.util.Scanner;

/*Q11: Palindrome Number [Easy]
- Input: 121
Output: Palindrome
- Input: 12321
Output: Palindrome
*/
public class palindrome {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         System.out.print("Enter the number: ");
        int num = scr.nextInt(); 
        int original = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
