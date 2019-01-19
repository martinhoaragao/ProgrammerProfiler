import java.util.Scanner;
//package model;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n==1) {
            System.out.println(Math.abs(s.nextInt() - s.nextInt()));
            return;
        }
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0; i<n; i++)
            b[i] = s.nextInt();
        
        
        int[] r = new int[n];
        r[n-1] = Math.abs(a[n-1]-b[n-1]);
        r[n-2] = (Math.abs(a[n-2]-a[n-1])+Math.abs(b[n-2]-b[n-1])) > (Math.abs(a[n-2]-b[n-2])+r[n-1]) ? (Math.abs(a[n-2]-a[n-1])+Math.abs(b[n-2]-b[n-1])) : (Math.abs(a[n-2]-b[n-2])+r[n-1]);
        
        if(n==2) {
            System.out.println(r[0]);
            return;
        }
        
        for(int i=n-3; i>=0; i--) {
            int h = Math.abs(a[i]-a[i+1])+Math.abs(b[i]-b[i+1]);
            int v = Math.abs(a[i]-b[i]);
            r[i] = h+r[i+2] > v+r[i+1] ? h+r[i+2] : v+r[i+1];
        }
        
        System.out.println(r[0]);
    }
}
