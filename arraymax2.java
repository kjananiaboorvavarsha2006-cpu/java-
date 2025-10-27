import java.util.Scanner;

public class arraymax2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number (all elements may be same).");
        } else {
            System.out.println("Second Largest Number: " + second);
        }

        sc.close();
    }
}
