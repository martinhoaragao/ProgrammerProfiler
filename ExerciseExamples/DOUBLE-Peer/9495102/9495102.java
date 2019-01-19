

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			if(N%2==0){
				System.out.println(N);
			}
			else{
				System.out.println(N-1);
			}
		}
			
		
		
		
	}
}