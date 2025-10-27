
import java.util.Scanner;

/*Q8: Spy Number [Medium]

A spy number is a number in which the sum of its digits is equal to the product of its digits

- Input: 1124
Output: Spy Number
- Input: 123
Output: Not Spy Number**/
public  class spy_number{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scr.nextInt();
        int sum=0;
        int pro=1;
        int dig=0;
        while(n>0){
            dig=n%10;
            sum=sum+dig;
            pro=pro*dig;
            n/=10;
        }
        if(sum==pro){
            System.out.println("THe given number is spy number!");
        }
        else{
            System.out.println("The  given number is not spy number!");
        }
    }
}