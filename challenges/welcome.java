import java.util.Scanner;
public class welcome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.nextLine();
        System.out.println("Welcome "+name+" ,Pleasure to meet you");
        input.close();
    }
}
