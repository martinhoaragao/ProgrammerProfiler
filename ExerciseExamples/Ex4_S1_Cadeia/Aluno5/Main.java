import java.util.Scanner;
public class Main
{
    public static int exercicio4 (String subcadeia, String cadeia){
        int x = 0;
        char i = subcadeia.charAt (0);
        for (int j = 0; j < cadeia.length(); j++){
            if (i == cadeia.charAt (j)){
                int k;
                for (k = 1; k < subcadeia.length(); k++){
                    if (k+j >= cadeia.length() || subcadeia.charAt(k) != cadeia.charAt(k+j)){
                        break;
                    }
                }
                if (k == subcadeia.length())
                    x++;
            }
        }
        return x;
    }
}
