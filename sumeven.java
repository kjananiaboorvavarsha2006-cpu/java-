
import java.util.Scanner;

/*Q15. Sum of Even Numbers (Easy)
Find the sum of even numbers between 1 and a given number.
Input format :
An integer.
Output format :
Sum of even numbers.
Sample test cases :
Input :
10
Output :
30
Input :
7
Output :
12
*/
public class sumeven{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         System.out.print("Enter the ending number:");
        int end=scr.nextInt();
        int sum=0;
        for(int i = 1;i <=end;i++){
              
            if(i%2==0){
           sum=sum+i;
            }
        }
           System.out.println("the sum is: "+sum);
    }
}