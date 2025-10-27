/*Q7. Max of 3 Numbers (Easy)
Find the maximum of three numbers.
Input format :
Three integers separated by spaces.
Output format :
The maximum number.
Sample test cases :
Input :
5 7 3
Output :
7
Input :
12 45 23
Output :
45*/
import java.util.Scanner;
public class max{
public static void main(String[]args){
    Scanner scr=new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<size;i++){
        arr[i]=scr.nextInt();
        if(max<arr[i])
        max=arr[i];

    }
    System.out.println(max);
}
}