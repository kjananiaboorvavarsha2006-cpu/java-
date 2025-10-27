import java.util.Scanner;
public class search{
public static void main(String[]args){
    Scanner scr=new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    int i;
    boolean found=false;
    for(i=0;i<size;i++)
    arr[i]=scr.nextInt();
    int key=scr.nextInt();
    for(i=0;i<size;i++)
    {
        if(key==arr[i])
        {
           found=true;
           break;
            
        }
    }
    if(found)
    {
        System.out.println(i);
    }
    else{
        System.out.println("-1");
    }
 }
 }

