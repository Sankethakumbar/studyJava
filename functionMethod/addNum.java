import java.util.Scanner;
public class addNum {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        greeting();
        System.out.println("Enter 2 numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        
        add(a,b);
        input.close();
        
    }
    public static void greeting(){
        System.out.println("hello, welcome to addition program");
    }
    public static int add(int x, int y){
        int sum=x+y;
        System.out.println(sum);
        return sum;
    }

    



}
