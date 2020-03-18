import java.util.*;
public class q17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int low= input.nextInt();
        int high = input.nextInt();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}