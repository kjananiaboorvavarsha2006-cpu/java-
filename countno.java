import java.util.Scanner;

 public class countno{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("Enter the number:");
         int n =scr.nextInt();
         int count=0;
         while(n>0){
            n/=10;
            count++;
         }
         System.out.println(count);
    }
 }