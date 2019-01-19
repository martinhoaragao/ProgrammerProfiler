	import java.util.*;
class bytelandiancoins
{
	static long[] arr;
	static long a =0 ,b =0,c = 0 , ele = 0 ,sum =0,max =0 ,maxa = -1 , maxb =-1 ,maxc =-1 ;
	static int i=0;
	public static void init()
	{
		a =0 ;b =0 ;c =0 ; ele = 0 ;sum =0;max =0 ;maxa = 0 ; maxb =0 ;maxc =0 ;i =0;
		arr = new long[10000];
	}
	public static long bytecoin(long n)
	{
		if((n/2)+(n/3)+(n/4) > n)
		{
			// System.out.println(i +" = "+n);
			/*
			i++;
			arr[i] = a;
			a = bytecoin(n/2);
			maxa = a;
			System.out.println(a);
			i--;

			b = bytecoin(n/3);
			maxb = b;
			System.out.println(b);

			c = bytecoin(n/4);
			maxc = c;
			System.out.println(c);
			
			System.out.println(" a+b+c "+(maxa+maxb+maxc));
			*/

			a = bytecoin(n/2)+bytecoin(n/3)+bytecoin(n/4);
			max = a;
			// System.out.println("a  "+a);
		}
		else
			return n;


		return a+b+c;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String line = " ";
		// try{
			while(s.hasNext())
			{
			line = s.nextLine();
			long a = Long.parseLong(line);
			init();
			long j = bytecoin(a);
			if(max == 0)
				System.out.println(a);
			else
				System.out.println(max);
			// System.out.println(bytecoin(a));	
			}
			
		// }
		// catch(NumberFormatException e)
		{

		}
		
	}
}