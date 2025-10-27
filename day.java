
import java.util.Scanner;

public class day{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scr.nextInt();
        switch(num) {
            case 1:
                System.out.println("day:1-sunday");
                break;
            case 2:
                System.out.println("day:2-monday");
                break;
            case 3:
                System.out.println("day:3-tuesday");
                break;
            case 4:
                System.out.println("day:4-wednesday");
                break;
            case 5:
                System.out.println("day:5-thursday");
                break;
            case 6:
                System.out.println("day:6-friday");
                break;
            case 7:
                System.out.println("day:7-satruday");
                break;

            default:
               System.out.println("Enter 1 to 7");
        }
    }
}