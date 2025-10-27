/*Q12. Descending Order of 4 Numbers (Easy)
Arrange four numbers in descending order.
Input format :
Four integers separated by spaces.
Output format :
Numbers in descending order.
Sample test cases :
Input :
5 8 2 9
Output :
9 8 5 2*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class descent{
    public static void main(String[] args) {
        Scanner csr=new Scanner(System.in);
        System.out.println("Enter the no of element: ");
       int a=csr.nextInt();
       Integer[] arr= new Integer[a];
       System.out.println("Enter the element: ");
       for (int i=0;i<a;i++){
        arr[i]=csr.nextInt();
       }
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.println("sorted descendind ordeer");
       for(int num : arr){
        System.out.print(num+" ");
       }


    }
}