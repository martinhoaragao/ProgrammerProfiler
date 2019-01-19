
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	private final static int MOD = 1000000007;
	public static void main(String[] args)
	{
//		long ca = System.currentTimeMillis();
		ArrayList<Long> al = new ArrayList<Long>();
		al.add(Long.valueOf(2));
		for (long i = 3; i < 10000; i += 2)
		{
			boolean bl = false;
			for (long l : al)
			{
				if (i % l == 0)
				{
					bl = true;
					break;
				}
			}
			if (!bl)
				al.add(Long.valueOf(i));
		}
//		long cb = System.currentTimeMillis();
//		System.out.println(cb+" "+ca+" "+(cb-ca));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
			String s = sc.next();
			if (s.length() >= 18)
			{
				System.out.println(1);
				System.out.println(s);
				continue;
			}
			Long lg = Long.parseLong(s);
			ArrayList<Long> ab = new ArrayList<Long>();
			for (long l : al)
			{
				while (lg%l == 0)
				{
					lg /= l;
					ab.add(l);
				}
			}
			if (lg > 1)
				ab.add(lg);
			int size = ab.size();
			System.out.println(size%MOD);
			for (int i = 0; i < size-1; ++i)
				System.out.print(ab.get(i).longValue()+" ");
			System.out.println(ab.get(size-1));
		}
	}
}
