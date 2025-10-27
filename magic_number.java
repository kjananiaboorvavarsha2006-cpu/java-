/*Q13: Magic Number [Hard]
A magic number can also refer to the recursive sum of its digits equaling one.
For example, the number 19: 1+9 = 10; 1+0 = 1
- Input: 1729
Output: Magic Number
- Input: 19
Output: Not Magic Number*/

import java.util.Scanner;

public class magic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (isMagic(n))
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }

    static boolean isMagic(int num) {
        int sum = num;
        while (sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum == 1 && num != 19;
    }
}
