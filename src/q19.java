import java.util.*;
class q19 {
    static void decToBinary(int n)
    {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int n =input.nextInt();
        decToBinary(n);
    }
}
