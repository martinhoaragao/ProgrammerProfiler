package strings_cadeia2;

import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class Strings_Cadeia2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n, m, cont = 0, k, j;
        String cadeia, subcadeia;

        System.out.println("cadeia?");
        cadeia = input.nextLine();
        System.out.println("sub-cadeia?");
        subcadeia = input.nextLine();
        n = cadeia.length();
        m = subcadeia.length();

        for (int i = 0; i < n; i++) {
            j = 0;
            k = i;
           while (j<m && k<n  && cadeia.charAt(k) == subcadeia.charAt(j)) {
                k++;
                j++;
            }

            if(j==m)
            cont=cont+1;
        }
        System.out.println(cont);
    }
    
}
