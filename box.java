import java.util.Scanner;

 public class box{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("Enter the number:");
         int n =scr.nextInt();
         for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++)
         System.out.print("*");
         System.out.println("");
         }
        }
        }