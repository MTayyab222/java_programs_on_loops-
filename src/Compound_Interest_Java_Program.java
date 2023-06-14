import java.util.Scanner;
public class Compound_Interest_Java_Program {
    public static void main(String[] args) {

//        A = P * (1 + r/n)^(n*t)
//
//        Where:
//        A = the final amount (including principal and interest)
//        P = the principal amount (initial investment)
//        r = the annual interest rate (expressed as a decimal)
//        n = the number of times that interest is compounded per year
//                t = the number of years
        Scanner s=new Scanner(System.in);
        double Final_amount;
        double principal_amount;
        double intrest_rate;
        double number_of_tiems;
        double number_of_years;
        System.out.println("Enter the the principal amount (initial investment): ");
        principal_amount =s.nextDouble();
        System.out.println("Enter the annual interest rate (expressed as a decimal): ");
        intrest_rate=s.nextDouble();
        System.out.println("Enter the number of times that interest is compounded per year: ");
        number_of_tiems=s.nextDouble();
        System.out.println("Enter the number of years: ");
        number_of_years=s.nextDouble();
        Final_amount=principal_amount*Math.pow(1+intrest_rate/number_of_tiems,(number_of_tiems*number_of_years));
        System.out.println("The final amount is:"+Final_amount);


    }
}
