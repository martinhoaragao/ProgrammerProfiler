import java.util.Scanner;

class TREEROOT {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TestCases=scn.nextInt();
		while(TestCases>0)
		{
			int SumOfNodes=0,SumOfAncestors=0;
			
			int NumOfNodes=scn.nextInt();
			
			for(int i=1;i<=NumOfNodes;i++)
			{
				int a=scn.nextInt();
				int b=scn.nextInt();
				SumOfNodes+=a;
				SumOfAncestors+=b;
			}
			System.out.println(SumOfNodes-SumOfAncestors);
			TestCases--;
		}
	}

}
