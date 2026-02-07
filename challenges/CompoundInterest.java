import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount, rate of interest and time period");
        int p=input.nextInt();
        int r=input.nextInt();
        int t=input.nextInt();
        double compoundInterest=p*Math.pow((1.0 + r / 100),t);
        System.out.println("Output= "+compoundInterest);
        input.close();
        
    }
    

}
