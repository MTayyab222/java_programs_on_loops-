import java.util.Scanner;
public class Perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int base;
        int side;
        int p;
        System.out.println("Enter the side: ");
        side=s.nextInt();
        System.out.println("Enter the base: ");
        base=s.nextInt();
        p=2*(base+side);
        System.out.println("The perimeter of the parallelogram is "+p);
    }
}
