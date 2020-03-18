import java.util.Scanner;
public class q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int j=0;
        for (int i =1; i<=n; i++){

            if(j%2==0){
               System.out.print(-i);
               System.out.print(" ");
            }
            else{
                System.out.print(i);
                System.out.print(" ");
            }
            j++;
        }
    }

}
