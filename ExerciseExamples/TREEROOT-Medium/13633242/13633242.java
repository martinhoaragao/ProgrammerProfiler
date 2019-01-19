import java.util.*;
import java.io.*;

class Assessment {
        public static void main(String args[]) {
                solve();     
         }

public static void solve() {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t > 0){
            t--;
            int n = scan.nextInt();
            int idSums = 0;
            int ids = 0;
            while(n > 0) {
                n--;
                int id = scan.nextInt();
                int idSum = scan.nextInt();
                ids += id;
                idSums += idSum;
            }
            // All id's sum - a ll given id's sum.
            System.out.println(ids-idSums);
        }
    }
}