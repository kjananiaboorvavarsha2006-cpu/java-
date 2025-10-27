/*
Q5. Mileage Remuneration Calculator (Medium)
Write a program that calculates mileage remuneration for a salesperson at a rate of Rs.25 per mile.
Your program should interact with the user in this manner:
Enter beginning odometer reading: 13505.2
Enter ending odometer reading: 13810.6
You traveled 305.4 miles. At Rs.25 per mile, your remuneration is Rs.7635
Note: Display the output to two decimal places and round the remuneration value.
Input format :
The input consists of the values of the beginning and ending odometer reading separated by a
space.
Output format :
The output prints the distance traveled and remuneration separated by a space.
Sample test cases :
Input :
13505.2 13810.6
Output :
305.40 7635.00
*/
import java.util.Scanner;
public class milecal{
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the starting odometer reading: ");
        float beg=scr.nextFloat();
         System.out.print("Enter the ending odometer reading: ");
         float end=scr.nextFloat();
         float dist=end-beg;
         int amount=Math.round(dist*25);
         System.out.println("The amount of distance travel: "+dist);
         System.out.println("The amount for the travel miles as per mile is rs.25: "+amount);
    }
}