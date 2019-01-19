import java.util.*;
class Order2{
        public static void main(String args[]){
                Scanner s=new Scanner(System.in);
                int t,n,pos,temp,j;
                int[] a,m;
                t=s.nextInt();
                for(int i=0;i<t;i++){
                      n=s.nextInt();
                      a=new int[n];
                      m=new int[n];
                      for(j=0;j<n;j++){
                                a[j]=s.nextInt();
                                m[j]=j+1;
                      }          
                      for(j=n-1;j>=0;j--){
                                pos=j-a[j];
                                temp=m[pos];
                                for(int k=a[j];k>0;k--){
                                        m[pos]=m[pos+1];
                                        pos++;
                                }
                                m[j]=temp;
                      }
                      for(j=0;j<n;j++){
                                System.out.print(m[j]+" ");
                      }
                      if(i!=t-1){
                                System.out.println();
                      }
                }
        }
}