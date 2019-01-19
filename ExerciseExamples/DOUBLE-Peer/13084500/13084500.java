import java.util.*;
class DOUBLE{
   public static void main(String args[]){
	   Scanner in = new Scanner(System.in);
	   int test=in.nextInt();
	   int i,j,k;
	   int[] result=new int[test+1];
	   for(i=0;i<test;i++)
	   {
		   int N=in.nextInt();
		   if(N%2==0)
		   result[i]=N;
	       else
		   result[i]=N-1;
	   }
	   for(i=0;i<test;i++)
	   {
		   System.out.println(result[i]);
	   }
	   
   }


}