import java.util.*;
public class q23 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int sum1=1;
        int sum2=2;
        for(int i=1;i<n;i++){
            if(i%2 != 0){

                System.out.printf("%d ",sum1);
                sum1+=3;
            }
            else{

                System.out.printf("%d ",-sum2);
                sum2+=4;
            }
        }
    }
}
