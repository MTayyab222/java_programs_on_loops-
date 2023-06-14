import java.util.Scanner;
public class Calculate_Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.println("Enter the x1 and x2: ");
        x1=s.nextDouble();
        x2=s.nextDouble();
        System.out.println("Enter the y1 and y2: ");
        y1=s.nextDouble();
        y2=s.nextDouble();
        System.out.println("The distance between the two points is: ");
        double X;double Y;
        X=(x1+x2)/2;
        Y=(y1+y2)/2;
        System.out.println("Distance between the two points: "+"("+ X+" ,4 "+Y+")");
    }
}
