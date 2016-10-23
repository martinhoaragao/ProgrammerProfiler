
import java.util.*;
import java.lang.String;
public class exc4
{
    public void exc4()
    {
        StringBuilder cadeia = new StringBuilder();
        StringBuilder subcadeia = new StringBuilder();
        Scanner scan = new Scanner (System.in);
        System.out.println("Introduza a string (maior): ");
        cadeia.append( scan.nextLine());
        System.out.println("Introduza a substring (menor): ");
        subcadeia.append(scan.nextLine());
        
        int i, j;
        int count = 0;
        int control = 0;
        
        for (i=0; i<cadeia.length(); i++){
            j=0;
            control =0;
            for (j=0; j<subcadeia.length(); j++){
                if ( i+j<cadeia.length() && subcadeia.charAt(j) == cadeia.charAt(i+j) ){
                    control ++;
                    //i++;
                }
                else break;
            }
            if (control == subcadeia.length() ) count++;
        }
        
        System.out.println(cadeia);
        System.out.println(subcadeia);
        System.out.println("ocorrencias: " + count);
        
        
        
     }
}
