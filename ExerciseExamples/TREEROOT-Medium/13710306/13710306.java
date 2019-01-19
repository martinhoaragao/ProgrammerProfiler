
import java.util.*;
import java.lang.*;

/**
 * Created by goelakas on 21/05/17.
 */
class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while (t > 0) {
            t--;
            int n = reader.nextInt();
            int lsum = 0;
            int rsum = 0;
            for(int i=0; i<n; i++) {
                lsum += reader.nextInt();
                rsum += reader.nextInt();
            }
            System.out.println(lsum-rsum);
        }
    }

}

