
import java.util.Scanner;

public class arrayinsert{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int size=scr.nextInt();
        int arr[]=new int[size+1];
        for(int i=0;i<size;i++)
        arr[i]=scr.nextInt();
        int pos=scr.nextInt();
         int elem=scr.nextInt();
         for(int i=size;i>pos;i--)
            arr[i]=arr[i-1];
            arr[pos-1]=elem;
         
    }
}