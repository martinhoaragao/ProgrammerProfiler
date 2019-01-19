import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
 
class FACTORIZ {
 
	static	int n = 10000000;
	static	boolean prime[] = new boolean[n];
 
	public static void sieve()
    {
        
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        int sqrt=(int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++)
            if(prime[i])
                for(int k=i*i;k<n;k+=i)
                    prime[k]=false;
      }
 
 
	public static void main(String[] args)  throws Exception{
 
		sieve();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t =   Integer.parseInt(in.readLine(),10);
		long range =100000000000000L;
		int max_Count = 1;
										   
		while(t-->0)
		{
			BigDecimal b = new BigDecimal(in.readLine());
			
			
			if(b.doubleValue()<range)
			{
				long ans = b.longValue();
			
				int count = 0;
				int arr[] = new int[max_Count];
				int index = 2;
				
				while(ans>1&&count<max_Count&&index<n)
				{
					while(index<n&&prime[index]!=true) index++;
							
					while(ans%index==0&&ans>1&&index<n)
					{
						if(count ==max_Count) break;
						arr[count] = index;
						ans = ans/index;
						count ++;
					}
					index++;
								
				}
				System.out.println(count);
				if(count==max_Count)
				{
					count = 0;
					while(count<max_Count-1)
					{
						System.out.println(arr[count]);count++;
					}
					System.out.println(ans*arr[max_Count-1]);
				}
				else
				{
					count = 0;
					while(count<max_Count&&arr[count]!=0)
					{
						System.out.println(arr[count]);count++;
					}
					
				}
				
			}
			else
			{
				System.out.println("1");
				System.out.println(b);
		
			}
			
		}
 
	}
 
}