
import java.util.Scanner;

public class centerdigit{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num=scr.next();

        int len=num.length();
        if(len%2==1){
             char center = num.charAt(len / 2);
            System.out.println("center digit of "+ num +" is "+center);
        }
        else{
            System.out.println("-1");
        }
    }
}