import java.util.*;

public class Quatro {
    
    public static void main(String[] args) {
    
        int idx, num = 0;
        String str, subStr;
    
        subStr = args[0];
        str = args[1];

        System.out.println(" ===== Quatro ~ Maraville ===== ");

        for (int i= 0; i < str.length() - subStr.length(); i++) { 
            if (str.substring(i, i+subStr.length() ).equals(subStr))  num++;
        }

        System.out.println("Total: " + num);
    }
}
