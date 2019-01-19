import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Map<Long,Long> m = new HashMap<Long, Long>();
	        
    static long maxNo(long n){
        if(n <= 1 )
            return n;
        if( m.containsKey(n) )
            return m.get(n) ;
        long ans = Math.max(n,maxNo(n/2)+maxNo(n/3)+maxNo(n/4)) ;
        m.put(n,ans) ;
        return ans ;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    long n;
	    Scanner s= new Scanner(System.in);
	    while(s.hasNext())
        {
            Long temp = s.nextLong();
            //System.out.println(temp);
            System.out.println(maxNo(temp));
        }
	}
}
 