import java.util.Scanner;
public class add{
public static void main(String[]args){
    Scanner scr=new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    int sum=0;
    for(int i=0;i<size;i++)
    {
    arr[i]=scr.nextInt();
   sum=sum+arr[i];
 }
  System.out.println(sum);
}
 }