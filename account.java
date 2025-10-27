/*Q10. SBI Credit Card Eligibility (Hard)
Check eligibility for SBI Credit Cards based on criteria:
- Primary applicant age: 21 to 60 years
- Add-on card applicant age: above 18 years
- Employment type: Salaried(1), Self-employed(2), Student(3), Retired pensioner(4)
- Income: up to Rs.3 lakh per year
Input format :
First line: Age of primary applicant
Second line: Age of add-on card applicant
Third line: Employment type code
Fourth line: Income
Output format :
Eligible / Not Eligible
Sample test cases :
Input :
45
20
2
300000
Output :
Yes. You are eligible for SBI credit cards
Input :
45
15
2
300000
Output :
No. You are not eligible for SBI credit cards
*/
import java.util.Scanner;
public class account{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Age of primary applicant: ");
        int primary_age=scr.nextInt();
        System.out.print("Age of add-on card applicant: ");
        int age=scr.nextInt();
        System.out.print("Employment type: Salaried(1), Self-employed(2), Student(3), Retired pensioner(4): ");
        int type=scr.nextInt();
        System.out.print("Income: ");
        int income=scr.nextInt();
        if((primary_age >= 21 && primary_age <= 60)
         && (age > 18) 
         &&( type >= 1 && type <= 4) 
         && (income <= 300000))
         {
         System.out.println("Yes. You are eligible for SBI credit cards");
} else {
    System.out.println("No. You are not eligible for SBI credit cards");
}    
        

    }
}

