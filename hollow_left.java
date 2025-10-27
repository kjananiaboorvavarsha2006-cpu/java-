import java.util.Scanner;

 public class hollow_left{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("Enter the number:");
         int n =scr.nextInt();
         for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++) {
        if(i==n||j==1||i==j)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        System.out.println();
         }
    }
 }