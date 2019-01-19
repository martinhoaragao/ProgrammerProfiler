import java.util.ArrayList;
import java.util.Scanner;
 
/**
 * https://www.codechef.com/problems/TREEROOT
 * @author varun
 */
class TREEROOT {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        TREEROOT treeRoot = new TREEROOT();
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int root = 0;
            for (int i = 1; i <= n; i++) {
                int id = in.nextInt();
                int sum = in.nextInt();
                root += (id - sum);
            }
            System.out.println(root);
        }    
    }
}
 
