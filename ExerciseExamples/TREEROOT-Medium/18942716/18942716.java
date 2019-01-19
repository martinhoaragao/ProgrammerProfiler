import java.lang.*;
import java.util.*;
import java.io.*;
class tree_root
{
	static Scanner ip=new Scanner(System.in);
	public static int solve(int [][]data)
	{
		int id=0;
		for(int i=0;i<data.length;i++)
		{
         id+=(data[i][0]-data[i][1]);
		}
		return id;
	}
	public static void main(String[] args) {
		int test=ip.nextInt();
		while (test!=0)
		{
            int n=ip.nextInt();
            int data[][]=new int[n][2];
            for(int i=0;i<n;i++)
            {
            data[i][0]=ip.nextInt();
            data[i][1]=ip.nextInt(); 
            }
			System.out.println(solve(data));
			test-=1;
		}
	}
}