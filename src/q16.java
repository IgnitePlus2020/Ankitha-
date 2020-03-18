import java.util.*;
public class q16 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] a = new int[100];
        for( int i =3; i<=n; i++){
            for(int j= 2; j<= i/2; j++){
                if(i%j==0){
                    break;
                }
            }
            System.out.print(i);
        }


    }
}
