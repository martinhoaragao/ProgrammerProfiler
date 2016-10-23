import java.util.*;
import java.lang.*;

public class ex4 {
    
    public static void main(String subc, String c) {
        int count = 0, i = 0, j = subc.length();
        String a;
        while (j <= c.length()) {
            a = c.substring(i, j);
            if (a.equals(subc)) count++;
            i++; j++;
        }
        System.out.println(c + " contém " + count + " ocorrências de " + subc);
    }
}