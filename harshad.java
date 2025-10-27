/*Q7: Harshad / Niven Number [Medium]
- Input: 18
Output: Harshad Number
- Input: 21
Output: Not Harshad Number*/
import java.util.Scanner;
public class harshad{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scr.nextInt();
        int sum=0;
      int temp=n;
       while(temp>0){
        sum=sum+temp%10;
    temp/=10;
       } 
       if(n % sum ==0){
        System.out.println("Harshad Number");
       }
       else{
        System.out.println("Non Harshad Number");
       }
    }
}