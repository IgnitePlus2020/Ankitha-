import java.util.*;
public class q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int l,s;
         l = a>b? (a>c?a:c):(b>c?b:c);
        System.out.println("The largest number is "+l);
        s = l==a ? (b>c ? b: c): (l==b ? (a>c ?a:c): (a>b?a:b));
        System.out.println("The second largest number is " +s);

    }
}
