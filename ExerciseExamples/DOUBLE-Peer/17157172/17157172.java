/**
 *
 * @author Rahul
 */

import java.util.*;
class doubleStrings {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            if(a%2==0)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(a-1);
            }
        }
    }
}
