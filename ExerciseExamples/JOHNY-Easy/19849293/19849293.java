import java.util.Arrays;
 import java.util.Scanner;
  class JavaApplication1 {
    public static void main (String []args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            t--;
        int n=in.nextInt();
        int x []=new int [n];
        for(int i=0;i<n;i++)
            x[i]=in.nextInt();
            int a=in.nextInt();
            int m=x[a-1];
            Arrays.sort(x);
            for(int i=0;i<n;i++){
                if(m==x[i])
            System.out.println(i+1);
    }
        }
    }
}