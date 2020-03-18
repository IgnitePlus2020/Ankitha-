import java.util.*;
public class q11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2; i<=n; i++){
            if(i%2 == 0){
                System.out.printf("%d ", i*i);
            }
        }
    }
}
