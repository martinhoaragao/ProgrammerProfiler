import java.util.Scanner;
import java.lang.String;

public class ex4{

    public static void main(String sub, String s){
        int n=0;
        String nova;
        for(int i=0;i<=s.length()-sub.length();i++){
            nova= s.substring(i,s.length());
            nova= nova.substring(0,sub.length());
            if (nova.equals(sub)) n++;
        }
        String a ="Aparece "+n+" vezes";
        System.out.println(a);
    }
}
