import java.util.Scanner;

public class ex4
{
    public static void cadeia (String sub,String cadeia){
        int total=0,i;
        CharSequence sub_cadeia; 
        for(i=0; i< cadeia.length()-sub.length() ; i++){
            sub_cadeia = cadeia.subSequence(i, i + sub.length());
            if(sub_cadeia.equals(sub)){
                total++;
            }
        }
        System.out.println("Total : " + total);
    }
}
