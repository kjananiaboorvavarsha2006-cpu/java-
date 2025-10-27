
import java.util.Scanner;

/*Q17. Factorial (Medium)
Find the factorial of a number.
Input format :
An integer.
Output format :
Factorial value.
Sample test cases :
Input :
5
Output :
120
Input :
-7
Output :
Error! Factorial of a negative number doesn't exist.*/
public class factorial {
    public static void main(String[] args) {
      Scanner scr=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n=scr.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
       if(n>0){
        System.out.println("Factorial of " + n + " = " + fact);
    }
    else{
        System.out.println("Error! Factorial of a negative number doesn't exist.");
    }
}
}