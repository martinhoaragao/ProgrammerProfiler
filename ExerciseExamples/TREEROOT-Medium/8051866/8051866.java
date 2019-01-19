import java.util.Scanner;


class TreeRoot {

	 public static void main(String[] args) 
	 {
	 			Scanner in=new Scanner(System.in);
	 			//System.out.println(isprime(53));
	 		  int n=in.nextInt(),j=0,t,temp;
	 			int x,y;
	 		  while(j<n)
	 			{
	 			  int S=0,S2=0;
	 			  int l=in.nextInt();
	 			  for(int i=0;i<l;i++)
	 			  {
	 				  x=in.nextInt();
	 				  y=in.nextInt();
	 				  S2+=x;
	 				  S+=y;
	 			  }
	 			// System.out.println(S2);
	 			  x=S2-S;
	 			  System.out.println(x);
	 			 j++; 
	 			}
	 			}

}
