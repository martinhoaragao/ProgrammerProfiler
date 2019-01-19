import java.util.*;
class Boss {
	public static Map<Long,Long> map = new HashMap<Long, Long>();
	public static void main(String args[])
	{
		  long n;
		    Scanner sc= new Scanner(System.in);
		    while(sc.hasNext())
	        {
	            Long temp = sc.nextLong();
	            System.out.println(scum(temp));
		}
	}
	static long scum(long n)
	{
		if(n <= 1 )
            return n;
        if( map.containsKey(n) )
            return map.get(n) ;
        long answer = Math.max(n,scum(n/2)+scum(n/3)+scum(n/4)) ;
        map.put(n,answer) ;
        return answer ;
	}
}
 
 