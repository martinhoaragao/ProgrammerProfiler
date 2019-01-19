import java.util.*;
import java.io.*;
import java.math.*;
class Codechef {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int root = 0;
            for(int i = 0; i<n; i++) {
                root+=sc.nextInt();
                root-=sc.nextInt();
            }
            System.out.println(root);
        }
    }
}