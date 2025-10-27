/*Q19. Sum of Numbers Divisible by 3 or 5 (Medium)
Accept an integer range and print the sum of numbers that are divisible by either 3 or 5.
Input format :
Two integers (start and end).
Output format :
Sum of numbers.
Sample test cases :
Input :
1 10
Output :
33*/
import java.util.Scanner;
public  class sumdiv{
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int start=scr.nextInt();
         System.out.print("Enter the ending number:");
        int end=scr.nextInt();
        int sum=0;
        for(int i = start;i <=end;i++){
            if(i%3==0 || i%5==0){
              sum= sum+i;
            }

        }
        System.out.println("The sum of number divisible by 3 0r 5: "+sum);
    }
}