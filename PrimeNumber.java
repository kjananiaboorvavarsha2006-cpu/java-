/*Q24. Prime Number (Easy)
Check whether a number is Prime.
Input format :
An integer.
Output format :
Prime / Not Prime.
Sample test cases :
Input :
7
Output :
Prime
Input :
10
Output :
Not Prime*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scr.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

        scr.close();
    }
}

