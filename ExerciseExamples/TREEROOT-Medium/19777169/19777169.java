import java.util.*;
 class root_tree {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int test=s.nextInt();
		while(test>0)
		{
			int root=0;
			int n=s.nextInt();
			
			for(int i=0;i<n;i++)
			{
				int a=s.nextInt();
				int b=s.nextInt();
				
				root+=a-b;
				
			}
			System.out.println(root);
					
			test--;
		}
	}

}
