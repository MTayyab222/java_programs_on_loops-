import java.util.Scanner;
public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //2pirh
        double radius,height,surface_area_of_the_cylinder;
        System.out.println("Enter the radius: ");
        radius=s.nextDouble();
        System.out.println("Enter the height: ");
        height=s.nextDouble();
        surface_area_of_the_cylinder=2*Math.PI*radius*height;
        System.out.println("The Curved Surface Area Of Cylinder is: "+surface_area_of_the_cylinder);

    }
}
