/*Q9: Neon Number [Medium]
- Input: 9
Output: Neon Number
- Input: 1
Output: Neon Number*/
import java.util.Scanner;
public class neno{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum=0;
        int num= n*n;
        while(num>0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
       if(n==sum){
        System.out.println("The Given Number is Neno!");
       }
       else{
        System.out.println("The given Number is Not a Neno!");
       }
    }
}