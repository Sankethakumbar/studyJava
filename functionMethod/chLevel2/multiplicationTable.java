package chLevel2;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number for multiplication table:");
        int num=input.nextInt();
        int i=1;
        while(i<=10){
            int table=num*i;
            System.out.println(num+" * "+i+" = "+table);
            i++;
        }
        input.close();
        
    }
}
