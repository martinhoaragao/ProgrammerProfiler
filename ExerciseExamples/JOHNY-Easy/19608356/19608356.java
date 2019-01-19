import java.util.*;
class JOHNY {
	  public static void main(String args[])
	  {
		  Scanner in=new Scanner(System.in);
		  int T=in.nextInt();
		  if(T>0 && T<=1000)
		  {
			  while(T>0)
			  {
				  int i;
				  int N=in.nextInt();
				  int a[]=new int[N];
				  for(i=0;i<N;i++)
					  a[i]=in.nextInt();
				  int K=in.nextInt();
				  int key=a[K-1];
				  Arrays.sort(a);
				  int pos=Arrays.binarySearch(a, key);
				  System.out.println(pos+1);
				  T--;
			  }
		  }
	  }
}