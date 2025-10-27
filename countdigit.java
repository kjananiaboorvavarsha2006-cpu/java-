/*Q3: Count Digits [Easy]
- Input: 98765
Output: 5
- Input: 123456789
Output: 9*/
import java.util.Scanner;
public class countdigit{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =scr.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}