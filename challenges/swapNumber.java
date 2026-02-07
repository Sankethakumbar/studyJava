import java.util.Scanner;
public class swapNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number a=");
        int a= input.nextInt();
        System.out.print("Enter first number b=");
        int b= input.nextInt();
        System.out.println("Before Swap:- a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:- a="+a+" b="+b);

        input.close();
        
    }

}
