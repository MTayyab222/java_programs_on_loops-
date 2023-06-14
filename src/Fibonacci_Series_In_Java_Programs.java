import java.util.Scanner;
public class Fibonacci_Series_In_Java_Programs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int term=0,t1=0,t2=1;
        System.out.print(t1+" "+t2);
        for(int i=2;i<10;i++){
            term=t1+t2;
            System.out.print(" "+term);
            t1=t2;
            t2=term;

        }
    }
}
