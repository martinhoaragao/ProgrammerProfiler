
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner readr = new Scanner (System.in);
        
        int inputs = 0;
        int n = 0;
        long [] data = null;
        int k = 0;
        long unc = 0;
        
        inputs = readr.nextInt();
        for(int i = 0; i < inputs; i++){
            n = readr.nextInt();
            
            data = new long[n];
            for(int j = 0; j < n; j++){
                data[j] = readr.nextLong();
            }
            
            k = readr.nextInt();
            
            unc = data[k-1];
            
            Arrays.sort(data);
            
            for(int j = 0; j < n; j++){
                if(data[j] == unc){
                    System.out.println(j+1);
                }
            }
        }
    }
}
    
