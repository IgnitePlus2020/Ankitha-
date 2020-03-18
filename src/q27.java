import java.util.*;
import java.lang.Math;
public class q27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the number");
        int len = input.nextInt();
        System.out.println("enter the number");
        int n = input.nextInt();
        int num = n;
        int i = 0;
        int sum =0;
        int[] a = new int[20];
        while( n > 10 ){
            a[i] = n % 10;
            sum +=Math.pow(a[i],len);
            n=n/10;
            i++;
        }
        sum += Math.pow((int)n,len);

        System.out.println(sum);

        if(num==sum){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not a number");
        }
    }
}
