public class palindrome {
    public static void main(String[] args) {
        int num = 121; 
        int original = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;//take last digit
            rev = rev * 10 + digit;//remove last digit
            num = num / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
