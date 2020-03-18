import java.util.*;
public class q21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=1;
        for (int i =0; i<=n; i++){
            sum = sum+ i*i;
            if(i%2 == 0){
                System.out.printf("%d ",sum);
            }
            else{
                System.out.printf("%d ",-sum);
            }

        }
    }
}

