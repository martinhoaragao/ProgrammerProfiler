/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Jawad
 */
class Codechef 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int ans[]=new int[t];
    for(int i=0;i<t;i++)
    {
        int x=sc.nextInt();
        if(x%2==0)
            ans[i]=x;
        else
            ans[i]=x-1;
    }
    for(int i=0;i<t;i++)
        System.out.println(ans[i]);
    }
}
