import java.util.*;
class unclejhony
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int r=1;r<=t;r++)
        {    int p=0,temp;

            
            int n= sc.nextInt();
            int arr[] =new int[n];
            

            for(int i=0; i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int k =sc.nextInt();
            p=arr[k-1];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0; i<n;i++)
            {
                if(arr[i]==p)
                    p=i;

            }
            System.out.println(p+1);
        }
    }
}