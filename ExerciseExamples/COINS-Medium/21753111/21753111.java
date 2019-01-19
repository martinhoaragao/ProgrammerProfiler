
import java.util.HashMap;
import java.util.Scanner;

class ByteLand {
	
	static HashMap<Long,Long> map = new HashMap<Long,Long>();
	
	public static long maxcoins(long x)
	{
		if(x<=11)
			return x;
		else if(map.containsKey(x))
			return map.get(x);
		else
		{
			long c = maxcoins(x/2)+maxcoins(x/3)+maxcoins(x/4);
			map.put(x, c);
			return c;
		}
	}
		
	public static void main(String[] args)
	{
		Scanner st = new Scanner(System.in);
		
		while(st.hasNext())
		{
			int x = st.nextInt();
			System.out.println(maxcoins(x));
		}
		st.close();
	}
}

