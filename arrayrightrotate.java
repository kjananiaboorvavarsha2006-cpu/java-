
import java.util.Arrays;
import java.util.Scanner;
public class arrayrightrotate{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
          System.out.print("Enter size :");
        int size=scr.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scr.nextInt();
        }
       System.out.print("Rotation size:"); 
        int right=scr.nextInt();
        for(int j=1;j<=right;j++){
        int temp=arr[size-1];
        for(int i=size-2;i>=0;i--)
        {
            arr[i+1]=arr[i];

        }
        arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}