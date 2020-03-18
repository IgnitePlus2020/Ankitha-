import java.util.*;
public class q25 {
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev =reverseString(str);
        System.out.println(rev);
    }
}