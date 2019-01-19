import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t= sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
           int a[]=new int[n+1];
           a[0]=0;
           for(int i=1;i<=n;i++){
               a[i]=sc.nextInt();
           }
           int k=sc.nextInt();
           int count=0;
           for(int i=1;i<=n;i++){
              if(a[i]<a[k] || (a[i]==a[k] && i<=k)){
                  count++;
              }
           }
           System.out.println(count);
      }
   }
}  