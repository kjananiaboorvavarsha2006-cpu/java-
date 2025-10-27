
import java.util.Scanner;

/*Q25. Perfect Square (Easy)
Check whether a number is a Perfect Square.
Input format :
An integer.
Output format :
Perfect Square / Not Perfect Square.
Sample test cases :
Input :
25
Output :
Perfect Square
Input :
20
Output :
Not Perfect Square*/
public class perfectsquare{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=scr.nextInt();
        int sqrt=(int)Math.sqrt(n);
        if(sqrt*sqrt==n){
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}