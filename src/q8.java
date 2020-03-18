import java.util.Scanner;
public class q8
{

    public static void main(String[] args){
        int sum_even=0;
        int sum_odd=0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int i =0; i<=n; i++){
            if(i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd=sum_odd+i;
            }
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);

    }
}
