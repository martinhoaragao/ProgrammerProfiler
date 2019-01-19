import java.io.*;
import java.util.*;

class A9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int l=0;l<t;l++){
            int n = sc.nextInt();
            long sumNode=0;
            long sumChild=0;
            for(int i=0;i<n;i++){
                sumNode+=sc.nextInt();
                sumChild+=sc.nextInt();
            }
            System.out.println(sumNode-sumChild);
        }
    }
}