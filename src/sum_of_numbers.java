import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int num,sum=0;
      do{
          System.out.println("Enter the number: ");
          num=s.nextInt();
          sum=sum+num;

      }
      while ((num!=0));
        System.out.println(sum);

    }
}
