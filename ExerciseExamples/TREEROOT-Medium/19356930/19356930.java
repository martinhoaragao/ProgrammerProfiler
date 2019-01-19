//package treeroot;

import java.util.*;

class TreeRoot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int t=0;t<q;t++)
        {
            int n=sc.nextInt(),ans=0;
            for(int i=0;i<n;i++)
            {
                ans+=sc.nextInt()-sc.nextInt();
            }
            System.out.println(ans);
        }
    }
    
}
