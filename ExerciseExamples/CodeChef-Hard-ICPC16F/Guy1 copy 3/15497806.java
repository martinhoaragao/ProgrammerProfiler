/*
 * Author Ayub Subhaniya
 * Institute DA-IICT
 */

import java.io.*;
import java.math.*;
import java.util.*;

class Codeforces429C
{
	
	InputStream in;
	PrintWriter out;

	void solve() 
	{
		int t=ni();
		while (t-->0)
		{
			int n=ni();
			int m=ni();
			int d=ni();
			int D=ni();
			
			int requiredmax=m/n+(m%n==0?0:1);
			int requiredmin=m/n;
			if (d>n||requiredmin<d||requiredmax>D||m>(n*n))
				out.println(-1);
			else
			{
				int idx=0;
				int max=m%n;
				int i;
				for (i=0;i<max;i++)
				{
					for (int c=1;c<=requiredmax;c++,idx=(idx+1)%n)
						out.println((i+1)+" "+(idx+1));
				}
				for (i=max;i<n;i++)
				{
					for (int c=1;c<=requiredmin;c++,idx=(idx+1)%n)
						out.println((i+1)+" "+(idx+1));
				}
			}
		}
	}
	
	void run() throws Exception 
	{
		String INPUT = "C:/Users/ayubs/Desktop/input.txt";
		in = oj ? System.in : new FileInputStream(INPUT);
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		tr(System.currentTimeMillis() - s + "ms");
		
	}
	public static void main(String[] args) throws Exception 
	{
		new Codeforces429C().run();
	}
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte() 
	{
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) 
		{
			ptrbuf = 0;
			try 
			{
				lenbuf = in.read(inbuf);
			}
			catch (IOException e) 
			{
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean inSpaceChar(int c) 
	{
		return !(c >= 33 && c <= 126);
	}
	
	private int skip() 
	{
		int b;
		while ((b = readByte()) != -1 && inSpaceChar(b))
			;
		return b;
	}
	
	private double nd() 
	{
		return Double.parseDouble(ns());
	}
	
	private char nc() 
	{
		return (char) skip();
	}
	
	private String ns() 
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(inSpaceChar(b))) 
		{ // when nextLine, (inSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n) 
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(inSpaceChar(b))) 
		{
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m) 
	{
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n) 
	{
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	
	private int ni() 
	{
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') 
		{
			minus = true;
			b = readByte();
		}
		
		while (true) 
		{
			if (b >= '0' && b <= '9') 
			{
				num = num * 10 + (b - '0');
			} 
			else 
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl() 
	{
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') 
		{
			minus = true;
			b = readByte();
		}
		
		while (true) 
		{
			if (b >= '0' && b <= '9') 
			{
				num = num * 10 + (b - '0');
			}
			else 
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private boolean oj = true;
	
	private void tr(Object... o) 
	{
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}
	
}