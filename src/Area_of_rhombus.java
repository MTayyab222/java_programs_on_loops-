import java.util.Scanner;
public class Area_of_rhombus {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int d1,d2;
        int Area;
        System.out.println("Enter the diagonal one: ");
        d1=sc.nextInt();
        System.out.println("Enter the diagonal two: ");
        d2=sc.nextInt();
        Area=(d1*d2)/2;
        System.out.println("The area of the rhombus is: ");
        System.out.println(Area);

    }
}
