import java.util.*;

class j15{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		for (int i=0;i<n;i++){
			values.add(in.nextInt());
		}
		
		for(int j=0;j<n;j++){
			int a = values.get(j);
			if (a%2 == 0)
				System.out.println(a);
			else
				System.out.println(a-1);
		}
	}
}