import java.util.Scanner;

 public class sepratedig{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("Enter the number:");
         int n =scr.nextInt();
         int dig=0;
         while(n>0){
            dig=n%10;
            System.out.println(dig);
            n/=10;
         }
    }
 }