import java.util.Scanner;

public class q4_a
{

    public static void main(String[] args){
        int temp;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        temp = a;
        a = b;
        b= temp;
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
    }
}
