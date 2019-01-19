import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean toBreak = false;
		List<Integer> arrlIst = new ArrayList<Integer>();
		int temp;
		while(!toBreak) {
			temp = sc.nextInt();
			if(temp!=42) {
				arrlIst.add(temp);
			}else {
				toBreak = true;
			}
		}
		for(Integer a: arrlIst)System.out.println(a);
	}
}
