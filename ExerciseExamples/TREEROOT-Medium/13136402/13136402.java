
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 20/3/17.
 */
class TREEROOT {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int nodeCount = in.nextInt();
            int nodeSum= 0, childSum = 0;
            for (int i = 0; i<nodeCount; i++){
                nodeSum += in.nextInt();
                childSum += in.nextInt();
            }
            System.out.println(nodeSum-childSum);
        }
    }
}
