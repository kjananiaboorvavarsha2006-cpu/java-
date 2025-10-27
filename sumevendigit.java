/*Q20: Sum of Even Digits [Easy]
- Input: 123456
Output: 12
- Input: 789
Output: 8*/
import java.util.Scanner;
public class sumevendigit{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         System.out.print("Enter the starting number:");
        int start=scr.nextInt();
         System.out.print("Enter the ending number:");
        int end=scr.nextInt();
        int sum=0;
        for(int i = start;i <=end;i++){
              
            if(i%2==0){
           sum=sum+i;
            }
        }
           System.out.println("The sum is: "+sum);
    }
}