import java.util.Scanner;
public class q9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i =0;
        int [] a = new int[100];
        while(num>10){
           a[i] = num%10;
            num = num/10;
            System.out.print(a[i]);
            i++;

        }
        a[i]=num;
        System.out.print(a[i]);


    }
}
