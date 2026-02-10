import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a =input.nextInt();
        int b =input.nextInt();
        int bitAnd=a&b;
        int bitor=a|b;
        int bitxor=a^b;
        int bitcomp=~a;
        int left=a<<1;
        int right=a>>1;

        System.out.println(bitAnd);
        System.out.println(bitor);
        System.out.println(bitxor);
        System.out.println(bitcomp);
        System.out.println(left);
        System.out.println(right);

        input.close();
    }
}
