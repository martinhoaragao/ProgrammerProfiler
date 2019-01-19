import java.util.Scanner;
class pb3 {
		public static void main(String[] args) {
			Scanner in =new Scanner(System.in);
			int t=in.nextInt();
			int[][] a=new int[t][];
			int[] k =new int[t];
			for(int i=0;i<t;i++)
			{
					int n=in.nextInt();
					a[i]=new int[n];
					for(int j=0;j<a[i].length;j++)
					{
						a[i][j]=in.nextInt();
					}
					k[i]=in.nextInt();
					k[i]=a[i][k[i]-1];
			}
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<a[i].length-1;j++)
				{
					for(int l=0;l<(a[i].length-j-1);l++)
					{
							if(a[i][l]>a[i][l+1])
							{
								int c=a[i][l+1];
								a[i][l+1]=a[i][l];
								a[i][l]=c;
							}
							
					}
				}
				for(int l=0;l<a[i].length;l++)
				{
					if(a[i][l]==k[i]){
						System.out.println(l+1);
						break;
					}
				}
			}
		}
}
