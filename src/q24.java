import java.util.*;
public class q24 {
    static int a=1;
    public static void main(String[] args){
        int i=0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for(i = 0; i<m; i++){
             a=a*n;
        }
        System.out.print(a);

    }
}
