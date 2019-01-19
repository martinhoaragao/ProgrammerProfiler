import java.io.*;

class COINS {
	

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++)
		{
			String line = br.readLine().trim();
			int c = Integer.parseInt(line);
			System.out.println(splitCoin(c));
		}
		

	}
	
	public static long splitCoin(long a)
	{
		long one = a/2;
		long two = a/3;
		long three = a/4;
		long b = one+two+three;
		if(a>=b)
		{
			return a;
		}	
		return splitCoin(one) + splitCoin(two) + splitCoin(three);
	}

}
