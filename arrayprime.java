import java.util.Scanner;
public class arrayprime{
    public static void main(String[] args) { 
        Scanner scr=new Scanner(System.in);
        System.out.print("size: ");
        int size=scr.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        a[i]=scr.nextInt();
        for(int i=0;i<size;i++)
        {
        
    int flag=0;
    for(int j=2;j<a[i];j++){
        if(a[i]%j==0){
            flag=1;
        break;
        }
    }
     int count=0;
    if(flag==0){
         count++;
    }
    System.out.println(count);
}
}
       
}
