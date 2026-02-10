import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int year =input.nextInt();
        input.close();
        if(year%400==0 || year%100!=0 || year%4==0){
            System.out.println("IT IS A LEAP YEAR");
        }else{
            System.out.println("It is not a leap year");
        }

    }

}
