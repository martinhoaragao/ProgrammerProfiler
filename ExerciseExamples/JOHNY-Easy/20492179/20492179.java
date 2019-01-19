import java.util.Scanner;
import java.util.Arrays;
class Jhony{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	while(t!=0){
		int a=sc.nextInt(); // total no. of songs
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{b[i]= sc.nextInt();} // lengths of songs
	     int c=sc.nextInt(); // position of uncle song
		 int d=b[c-1];
		  Arrays.sort(b);
		
		
		for(int i=0;i<a;i++)
		{
			if(b[i]==d)
				System.out.println(i+1);
		}	
	t--;}}
}