import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStreamReader;

class UncleJohny {
   int N,K;
   BufferedReader br;
   int A[];
   int lim=101;
   UncleJohny(BufferedReader br)
   {
       this.br=br;
       A=new int[lim];
   }

   public void processInput(int N) throws IOException {
       this.N=N;
       String str=br.readLine();
       String strArr[]=str.split(" ");
       for(int i=0;i<strArr.length;i++)
           A[i]=Integer.parseInt(strArr[i]);
       this.K=Integer.parseInt(br.readLine());

   }

   public void getUncleJohnyIndex()
   {
       int uncleJohny=A[K-1];

       Arrays.sort(A,0,N);

       for(int i=0;i<N;i++)
       {
           if(A[i]==uncleJohny)
           {
               System.out.println(i+1);
               break;
           }
       }

   }


}

public class Main {

    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int T,N;
        T=Integer.parseInt(br.readLine());
        UncleJohny ob=new UncleJohny(br);
        while(T>0)
        {
            N=Integer.parseInt(br.readLine());
            ob.processInput(N);
            ob.getUncleJohnyIndex();
            T--;
        }
    }
}

