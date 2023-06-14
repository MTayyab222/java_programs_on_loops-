import java.util.Scanner;
public class Volume_Of_Cone_Java_Program {
    //V=πr2h/3
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double radius,height,V;
        System.out.println("Enter the radius :");
        radius=s.nextDouble();
        System.out.println("Enter the height :");
        height=s.nextDouble();
        V=Math.PI*(radius)*(radius)*(height/3);
        System.out.println("The volume of the Cone is: "+V);


    }
}
