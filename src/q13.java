import java.util.Scanner;
import java.lang.Math;
public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print((long)Math.pow(i, i));
            System.out.print(" ");
        }
    }
}



