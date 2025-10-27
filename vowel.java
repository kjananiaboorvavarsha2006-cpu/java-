
import java.util.Scanner;
public class vowel{
    public static void main(String[] args) {
         Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number:");
       String str=scr.nextLine;
       
        switch(str){
        case 1:
            System.out.println("a is vowel");
            break;
        case 2:
            System.out.println("e is vowel");
            break;
        case 3:
            System.out.println("i is vowel");
            break;
        case 4:
            System.out.println("o is vowel");
            break;
        case 5:
            System.out.println("u is vowel");
            break;   
            default:
                System.out.println("not a vowel"); 
        }    
    }
}