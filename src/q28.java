import java.util.*;
public class q28 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = input.nextInt();
        System.out.println("Enter the elements of the array");
        int [] n = new int [20];

        for (int i =0; i<len; i++){
            n[i]=input.nextInt();
        }
        System.out.println("Enter the key");
        int key = input.nextInt();

        for(int i =0 ; i<len; i++){
            if(n[i] == key){
                System.out.print("The number is present at location " +i);
            }
        }


    }
}
