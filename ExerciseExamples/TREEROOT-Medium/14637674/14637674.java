import java.util.Scanner;

/**
 * Created by dell on 7/22/2017.
 */
class TreeRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t>0)
        {
            int n;
            int id,sumId;
            int diff = 0;
            n = sc.nextInt();
            for (int i = 0 ; i < n ; i ++)
            {
                id = sc.nextInt();
                sumId = sc.nextInt();
                diff = diff + (id - sumId);
            }
            System.out.println(diff);
            t--;
        }



    }
}
