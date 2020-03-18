import java.util.*;
public class q14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[100];
        a[0]=1;
        a[1]=4;
        a[2]=7;
        for(int i=0; i<3; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        for(int i = 3;i<=n; i++){
           int  x=a[i-1]+a[i-2]+a[i-3];
           a[i]=x;
            System.out.print(x);
            System.out.print(" ");
        }
    }
}