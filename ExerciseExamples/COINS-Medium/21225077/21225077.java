import java.util.*;
class Comp
{
	static HashMap<Long,Long> map=new HashMap<>();
	static long findDollar(long n)
	{
		
		if(n<12)
			return n;
		else
		{	
			if(map.containsKey(n))
				return map.get(n);
			else
			{
				long sum=(findDollar(n/2)+findDollar(n/3)+findDollar(n/4));
				if(sum>n)
				{	map.put(n, sum);
					return (sum);
				}
				else
				{	map.put(n, n);
					return n;
				}
			}
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String object="";
		while(obj.hasNext())
		{
			object = obj.nextLine();
			if(object.equals(""))
				break;
			else
				System.out.println(findDollar(Long.parseLong(object)));
			
		}
		obj.close();
	}
	
}