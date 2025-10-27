import java.util.Scanner;
public class whilecalculator{
    public static void main(String[] args) {
        Scanner scr=new Scanner (System.in);
        System.out.println("Enter the numbers: ");
        int n1=scr.nextInt();
        int n2=scr.nextInt();
        System.out.print("Enter the number 1 to 5: "+(Character.isDigit(n1)&& Character.isDigit(n2)));
        int op=scr.nextInt();
        while(){
            if(op==1){
               int sum=n1+n2;
                 System.out.println("Addition: "+sum);
            }
            else if(op==2){
                int sub=n1-n2;
                System.out.println("subtracion: "+sub);
            }
            else if (op==3) {
                int mul=n1*n2;
                System.out.println("Multiply: "+mul);
            }
            else if(op==4){
                int div=n1/n2;
                System.out.println("division: "+div);
            }
            else if(op==5){
                int mod=n1%n2;
                System.out.println("modulus: "+mod);
            }
            else{
                System.out.println("Invaild");
            }
        }
    }
}
