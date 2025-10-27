/*Q11. Triangle Shape (Easy)
Check whether a triangle is Equilateral, Isosceles, or Scalene.
Input format :
Sides of the triangle in separate lines.
Output format :
Type of triangle.
Sample test cases :
Input :
18
18
18
Output :
Equilateral Triangle
Input :
12
25
15
Output :
Scalene Triangle
Input :
52
52
323
Output :
Isosceles Triangle*/
import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the angles:");
        int a1=scr.nextInt();
        int a2=scr.nextInt();
        int a3=scr.nextInt();
        if (a1==a2 && a2==a3){
            System.out.println("Equilateral Triangle");
        }
        else{
            if(a1==a2 && a1!=a3||a1!=a2 && a1==a3)
            {
                System.out.println("Isosceles Triangle");
            }
            else{
                if(a1!=a2 && a2!=a3 && a1!=a3){
                    System.out.println("Scalene Triangle");
                }
            }
        }
    }
}