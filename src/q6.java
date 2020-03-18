import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        int a = (int) (number);
        double b = number - (int)number;
        System.out.println(b);
        System.out.println(a);

    }
}
