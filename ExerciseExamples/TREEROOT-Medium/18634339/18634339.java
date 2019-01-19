import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int ans=0;
            while(n-->0){
                ans += in.nextInt() - in.nextInt();
            }
            System.out.println(ans);
        }
    }
}