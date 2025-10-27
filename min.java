import java.util.Scanner;
public class min{
public static void main(String[]args){
    Scanner scr=new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    int min=Integer.MAX_VALUE;
    for(int i=0;i<size;i++){
        arr[i]=scr.nextInt();
        if(min>arr[i])
        min=arr[i];

    }
    System.out.println(min);
}
}