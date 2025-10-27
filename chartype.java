/*Q13. Character Type (Easy)
Determine whether the given character is an alphabet, a digit, or a special character.
Input format :
A single character.
Output format :
alphabet / digit / special
Sample test cases :
Input :
A
Output :
alphabet
Input :
7
Output :
digit
Input :
@
Output :
special*/
import java.util.Scanner;
public class chartype{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char a=scr.next().charAt(0);
        if(Character.isDigit(a)){
      System.out.println(a+" is the digit");
        }
        else if(Character.isLetter(a)){
        System.out.println(a+" is the alphabet");
        }
        else{
            System.out.println(a+" is a special character.");
        }
    }
}