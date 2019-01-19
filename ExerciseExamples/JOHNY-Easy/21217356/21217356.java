import java.util.*;
 class Song {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		int i=0,j=0,op=0;
		 while(i<n)
		 {
			 int len=sc.nextInt();
			  int a[]=new int[len];
			   for(j=0;j<len;j++)
			   {
				   a[j]=sc.nextInt();
			   }
			   int pos=sc.nextInt();
			   for(j=0;j<len;j++)
			   {
				   if(pos-1==j)
					   op=a[j];
			   }
			   Arrays.sort(a);
			   for(j=0;j<len;j++)
			   {
				   if(op==a[j])
					   System.out.println(j+1);
			   }
			   ++i;
		 }

	}

}
