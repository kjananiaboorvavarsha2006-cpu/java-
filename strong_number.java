/*Q12: Strong Number [Hard]
A strong number is a positive integer for which the sum of the factorials of its individual digits equals the original number itself. For example, 145 is a strong number because 1! + 4! + 5! equals 1 + 24 + 120, which sums to 145. 

- Input: 145
Output: Strong Number
- Input: 2
Output: Strong Number*/
import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
    

        int original = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += fact(d);
            n /= 10;
        }

        if (sum == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }

    static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) f *= i;
        return f;
    }
}
