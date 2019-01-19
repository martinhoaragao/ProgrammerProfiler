
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ramandeeps
 */
class ReverseInsertion {
    private static final BufferedReader bi;
    private static final PrintWriter pw;
    
    static {
        bi = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
    }
    
    private static int[] getArrayFromString(String line, int len) {
        int i, j, k, arr[] = new int[len];
        i=j=k=0;
        try {
            while(j<line.length()) {
                while(line.charAt(j++) != ' ');
                arr[k++] = parseInt(line.substring(i, j-1));
                i=j;
            }
        }
        catch(java.lang.NumberFormatException nfe) {
            arr[k-1] = parseInt(line.substring(i));
        }
        catch(java.lang.StringIndexOutOfBoundsException sioobe) {
            arr[k] = parseInt(line.substring(i));
        }
        return arr;
    }
    
    private static int parseInt(String str) {
        int i, n=0;
        
        for(i=0; i<str.length(); i++) {
            n*=10;
            n+=str.charAt(i)-48;
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        int t = parseInt(bi.readLine()), n, pos[], orders[], i, j, temp;
        
        while(t-->0) {
            n = parseInt(bi.readLine());
            pos = getArrayFromString(bi.readLine(), n);
            orders = new int[n];
            
            for(i=0; i<n; i++) orders[i] = i;
            
            for(i=n-1; i>=0; i--) {
                temp = orders[i-pos[i]];
                for(j=i-pos[i]; j<i; j++) {
                    orders[j] = orders[j+1];
                }
                orders[i] = temp;
            }
            
            for(i=0; i<n; i++) pw.print(orders[i]+1 + " ");
            pw.println();
        }
        pw.flush();
    }
}
