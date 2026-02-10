import java.util.Scanner;
public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number");
        int a=input.nextInt();
        if((a&1)==0){
            System.out.println("It is even");
        }else{
            System.out.println("it is odd");
        }

        input.close();

    }

}
