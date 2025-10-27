/*Q9. Customer Grouping (Medium)
Customers are grouped according to age and gender.
Group 1: Males under 25 years old
Group 2: Females under 25 years old
Group 3: Males between 25 - 45 years old
Group 4: Females between 25 - 45 years old
Group 5: All people over 45 years old.
Note : Gender code for a male is 1 and for female is 2. Display Invalid if user enters other gender
codes.
Input format :
Age in first line
Gender code in second line
Output format :
Group number
Sample test cases :
Input :
23
1
Output :
Group 1*/
import java.util.Scanner;
public class group{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scr.nextInt();
        System.out.print("Enter the gender:");
        int gender=scr.nextInt();
        if(gender!=2 && gender!=1){
            System.out.println("INVALID");
        }
        else{
        if (age<=25 && gender==1) {
            System.out.println("group 1");
        }
        else if(age<=25 && gender==2){
            System.out.println("Group 2");
        }
        else if(age>=25 && age<=45 && gender==1){
            System.out.println("Group 3");
        }
        else if(age>=25 && age<=45 && gender==2){
            System.out.println("Group 4");
        }
        else{
            System.out.println("Group 5");
        }

        }
    }
}