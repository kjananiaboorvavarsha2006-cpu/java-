/*Q4. Convert Days into Years, Months, Days (Medium)
Convert the given number of days into completed years, months, and remaining days. Assume 1
year = 365 days, 1 month = 30 days.
Input format :
The input consists of an integer (days).
Output format :
The output prints completed years, months, and days.
Sample test cases :
Input :
400
Output :
Years: 1
Months: 1
Days: 5*/
import java.util.Scanner;
public class month{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the dates: ");
        int a=scr.nextInt();
        int year=a/365;
        int remaining1=a%365;
        int month=remaining1/30;
        int day=remaining1%30;
        System.out.println("Years: "+year);
        System.out.println("month: "+month);
        System.out.println("days: "+day);

    }
}