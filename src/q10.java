import java.io.*;
import java.util.*;

public class q10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();

        int [] a = new int[40];

        for (int t = 0; t < len; t++) {
            a[t] = scan.nextInt();
            switch(a[t]) {
                case (0):
                    System.out.print("zero ");
                    break;
                case (1):
                    System.out.print("one ");
                    break;
                case (2):
                    System.out.print("two ");
                    break;
                case (3):
                    System.out.print("three ");
                    break;
                case (4):
                    System.out.print("four ");
                    break;
                case (5):
                    System.out.print("five ");
                    break;
                case (6):
                    System.out.print("six ");
                    break;
                case (7):
                    System.out.print("seven ");
                    break;
                case (8):
                    System.out.print("eight ");
                    break;
                case (9):
                    System.out.print("nine ");
                    break;
                default:
                    System.out.println("invalid num ");
                    break;
            }
        }

    }
}