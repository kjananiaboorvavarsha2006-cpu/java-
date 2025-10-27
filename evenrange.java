
import java.util.Scanner;

/*Q14. Even Numbers in Range (Easy)
Display even numbers between a given range inclusive of both start and end.
Input format :
Two integers (start and end).
Output format :
Even numbers.
Sample test cases :
Input :
1 10
Output :
2 4 6 8 10*/
public  class evenrange{
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int start=scr.nextInt();
         System.out.print("Enter the ending number:");
        int end=scr.nextInt();
        for(int i = start;i <=end;i++){
            if(i%2==0){
           System.out.println(i);
        }
        }

    }
}