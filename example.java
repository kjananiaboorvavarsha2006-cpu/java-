import java.util.Scanner;
public class example{
public static void main(String[]args){
    Scanner scr=new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    arr[i]=scr.nextInt();
    for(int i=0;i<size;i++){
    System.out.println(arr[i]+"");
 }
 }
}