import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UncleJohnny {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<>();
			for(int i=0;i<n;i++)
				arrayList.add(scanner.nextInt());
			int k = scanner.nextInt()-1;
			int num = arrayList.get(k);
			Collections.sort(arrayList);
			System.out.println(arrayList.indexOf(num)+1);
		}
	}

}
