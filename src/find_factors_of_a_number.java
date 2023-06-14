import java.util.Scanner;
public class find_factors_of_a_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number;
        System.out.println("Enter any number whose factors you want to find: ");
        number=s.nextInt();
        int factor=0;
        for(int i=1;i<=number;i++){
            if((number%i)==0){
                System.out.print(i+" ");
            }

        }
    }
}
