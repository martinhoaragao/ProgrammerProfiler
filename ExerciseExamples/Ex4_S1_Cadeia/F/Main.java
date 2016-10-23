import java.util.Scanner;

public class Main
{
   static Scanner scan = new Scanner(System.in);
   
   public static void um() {
       System.out.println("Introduza a cadeia de caracteres");
        String cadeia = scan.next();
        System.out.println("Introduza agora a sub-cadeia de caracteres");
        String sub = scan.next();
        int tam = sub.length();
        int i, index, count = 0;
        if (cadeia.contains(sub)) {
            index = cadeia.indexOf(sub);
            i = index;
            while (i < cadeia.length()) {
                while((i+tam) <= cadeia.length()){
                    if (cadeia.charAt(i) == sub.charAt(0)){
                        System.out.println(cadeia.substring(i, i+tam));
                        if (cadeia.substring(i, i+tam).equals(sub)) count++;
                        i++;
                    }
                    else i++;
                }
            }
        }
        System.out.println(count + " vezes.");
   }
}
