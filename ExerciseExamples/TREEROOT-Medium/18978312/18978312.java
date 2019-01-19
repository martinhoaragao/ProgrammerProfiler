

import java.util.*;

class TREEROOT
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0)
        {
            int n=sc.nextInt();
            int sum_parent=0, sum_child=0;

            for(int i=0;i<n;i++)
            {

                sum_parent=sum_parent+sc.nextInt();
                sum_child=sum_child+sc.nextInt();
            }
            System.out.println(sum_parent-sum_child);
            t--;
        }
    }
}

        
        
