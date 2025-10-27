/*Q16. Sum of Odd and Even Numbers (Medium)
Find the sum of odd and even numbers from 1 to N.
Input format :
An integer.
Output format :
Sum of odd numbers and sum of even numbers separated by a space.
Sample test cases :
Input :
10
Output :
25 30
Input :
15
Output :
64 56*/
import java.util.Scanner;
public class sumoddeven{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         System.out.print("Enter the ending number:");
        int end=scr.nextInt();
        int sum=0;
        int sum1=0;
        for(int i = 1;i <=end;i++){
              
            if(i%2==0){
           sum=sum+i;
            }
            else{
                
                   sum1=sum1+i;
                   
                }
            }
             System.out.println("the sum of even: "+sum);
              System.out.println("The sum of odd: "+sum1);
        }
          
    }
