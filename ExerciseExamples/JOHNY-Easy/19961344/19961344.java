/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static Scanner sc;

    public static void pA(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] a,int l,int h,int x ){
        if(l>h)return -1;
        int m=l+h;m/=2;
        if(a[m]==x)return m;
        if(a[m]<x)return binarySearch(a,m+1,h,x);
        return binarySearch(a,0,m-1,x);
    }
    public static int solve(int n, int k, int[] a) throws java.lang.Exception {
        int x=a[k-1];
        Arrays.sort(a);
        return binarySearch(a,0,n-1,x)+1;
        //  return  ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        sc = new Scanner(System.in);
       // sc = new Scanner(new File("input.txt"));
        int it = sc.nextInt();
        for (int i_t = 0; i_t < it; i_t++) {

            int n = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int f = sc.nextInt();
            System.out.println(solve(n, f, a));
        }
    }
}
