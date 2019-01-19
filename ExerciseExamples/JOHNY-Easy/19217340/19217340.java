import java.util.*;
import java.io.*;
import java.lang.*;
class Codechef
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int[] arr=new int[n+1];
            for(int j=1;j<=n;j++){
                arr[j]=scan.nextInt();
            }
            int k=scan.nextInt();
            int r=arr[k];
            Arrays.sort(arr);
            for(int j=1;j<=n;j++){
                if(arr[j]==r){
                    System.out.println(j);
                    break;
                }
            }
        }   
    }
}