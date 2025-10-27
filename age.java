
import java.util.Scanner;

 public class age{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("enter your age:");
         int n =scr.nextInt();
        if(n>=18){
            System.out.println("your eligible");
        }
        else{
            System.out.println("your are not eligible");
        }
    }
 }
