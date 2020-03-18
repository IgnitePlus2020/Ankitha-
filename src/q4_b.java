import java.util.Scanner;

public class q4_b{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("a value is" +a);
        System.out.println("b value is" +b);
        System.out.println("c value is" +c);

    }
}
