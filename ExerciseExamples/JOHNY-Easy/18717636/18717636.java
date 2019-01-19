
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class xyz
{
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int test = scan.nextInt();
        ArrayList<Integer> list;
        while(test-->0)
        {
         list =new ArrayList();
         int N =scan.nextInt();
         for(int i=0;i<N;i++)
         {
             list.add(scan.nextInt());
         }
         int k= scan.nextInt()-1;
         int a =list.get(k);
            Collections.sort(list);
            System.out.println(list.indexOf(a)+1);
        }
    }
}
