import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
