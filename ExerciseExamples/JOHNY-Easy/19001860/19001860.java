import java.util.Scanner;

class JOHNY
{
    public static void main(String args[])
    {
        int T,N,K;
        try
        {
            Scanner sc = new Scanner(System.in);
            T=sc.nextInt();
            if(T>=1 && T<=1000)
            {
                do
                {
                
                N=sc.nextInt();
                if(N>=1 && N<=100)
                {
                    int[] A = new int[N];
                    for(int i=0;i<N;i++)
                    {
                        A[i]=sc.nextInt();
                        if(A[i]<1 || A[i]>1000000000)
                        {
                            System.exit(0);
                        }
                    }
                    K=sc.nextInt();
                    if(K>=1 && K<=100)
                    {   K--;
                        for(int i=0;i<N-1;i++)
                        {
                            for(int j=i+1 ;j<N;j++)
                            {   
                                if(A[i]>A[j])
                                {
                                    int temp=A[j];
                                    A[j]=A[i];
                                    A[i]=temp;
                                 
                                    if(j==K)
                                    {
                                        K=i;
                                        
                                    }
                                     else  if(i==K)
                                    {
                                    K=j;
                                  
                                    }
                                    
                                }
                                
                            }
                        }
                        K++;
                        System.out.println(K);
                     
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    System.exit(0);
                }
                T--;
                }while(T!=0);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}