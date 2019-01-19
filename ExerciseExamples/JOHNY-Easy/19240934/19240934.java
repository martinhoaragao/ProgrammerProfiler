import java.util.Scanner;
class Messi
{
public static void main(String[]args)
{    
    Scanner S=new Scanner(System.in);
    int T=S.nextInt();
    int a,b,c,d,e,i,t;
    for(a=0;a<T;a++)
    {   
        int fav=0;
        int N=S.nextInt();
        int x[]=new int[N];
        for(i=0;i<N;i++)
        {
            x[i]=S.nextInt();
        }
        int K=S.nextInt();
        for(b=0;b<=N;b++)
        {
            if(b==K)
            {
            fav=x[b-1];
            }
        }
        for(c=0;c<N-1;c++)
        {
            for(d=0;d<N-1;d++)
            {
                if(x[d]>x[d+1])
                {
                    t=x[d];
                    x[d]=x[d+1];
                    x[d+1]=t;                
                }
            }
        }
        for(e=0;e<N;e++)
        {
            if(x[e]==fav)
            {
                System.out.println((e+1));
            }
        }
        
    }
}
}
