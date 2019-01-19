/**
 *
 * @author Rahul
 */

import java.util.*;
class holesInTheText {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        do
        {
            t = sc.nextInt();
        }while(t>40);
        for(int i=0;i<t;i++)
        {
            String s = sc.next();
            s=s.toUpperCase();
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                for(int k=65;k<=90;k++)
                {
                    if(s.charAt(j)==(char)k)
                    {
                        if(k==65 || k==68 || k==79 || k==80 || k==81 || k==82)
                        {
                            count++;
                        }
                        else if(k==66)
                        {
                            count= count+2;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}