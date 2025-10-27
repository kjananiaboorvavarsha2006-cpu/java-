/*Q23. Perfect Number (Medium)
Check whether a number is a Perfect Number.
(A Perfect Number is equal to the sum of its proper divisors.)
Input format :
An integer.
Output format :
Perfect / Not Perfect.
Sample test cases :
Input :
28
Output :
Perfect Number
Input :
12
Output :
Not Perfect Number*/
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scr.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n && n != 0) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }
}
