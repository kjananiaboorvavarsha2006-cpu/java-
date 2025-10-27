import java.util.Scanner;

 public class seprate_l_to_r{
    public static void main(String[] args) {
        Scanner scr =new Scanner (System.in);
        System.out.print("Enter the number:");
         int n =scr.nextInt();
         int temp=n;
         int step=0;
         while(n>0){
            n=n/10;
            step++;
         }
         int div=(int)Math.pow(10, step-1);
         while(div>0){
            int dig=(temp/div)%10;
         
            System.out.println(dig);
            div/=10;
         }
    }
 }