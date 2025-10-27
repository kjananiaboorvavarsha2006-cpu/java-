
import java.util.Arrays;
import java.util.Scanner;
public class arrayreverse{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("size: ");
        int size=scr.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=scr.nextInt();
    
    int i=0;int j=size-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr));

}
}