import java.util.Scanner;

public class q3 {
    Scanner input = new Scanner(System.in);
    int p = input.nextInt();
    int t = input.nextInt();
    double r = input.nextDouble();

    double si()
    {
        return((double)(p*t*r)/100);
    }

    public static void main(String[] args){
        q3 c= new q3();
        double y=c.si();
        System.out.println(y);
    }
}
