import java.util.Scanner;

public class stringcount{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word= scr.nextLine();
        int space=0;
     for(int i=0;i<word.length();i++){
if(word.charAt(i)==' ')
space++;
     }
     System.out.println(space+1);
    }
}