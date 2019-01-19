
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class JOHNY{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcase, nos, index, ans, counter;
		Scanner s =new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		testcase=s.nextInt();
		for(counter=0;counter<testcase;counter++) {
			nos=s.nextInt();
			int []los=new int[nos];
			for(int i=0;i<nos;i++) {
				los[i]=s.nextInt();
			}
			index=s.nextInt()-1;
			ans=los[index];
			Arrays.sort(los);
			for(int i=0;i<nos;i++) {
				if(los[i]==ans)
					list.add(i+1);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}