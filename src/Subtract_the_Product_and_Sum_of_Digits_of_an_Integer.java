import java.util.Scanner;
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int num1,num2,answer;
    System.out.println("Enter the num1");
    num1=s.nextInt();
    System.out.println("Enter the num2");
    num2=s.nextInt();
    int addition=num1+num2;
    int product=num1*num2;
    answer=product-addition;
    System.out.println("Subtract the Product and Sum of Digits of an Integer: "+answer);

}
}
