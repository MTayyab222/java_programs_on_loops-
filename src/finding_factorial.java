import java.util.Scanner;
public class finding_factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number;
        int facto=1;
        System.out.println("Enter the number: ");
        number=s.nextInt();
        for(int i=number;i>=1;i--){
            facto=facto*i;
        }
        System.out.println("The factorial of the given number is: "+facto);

    }
}
