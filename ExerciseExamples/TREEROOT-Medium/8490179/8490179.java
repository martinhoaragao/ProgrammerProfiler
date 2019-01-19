import java.util.Scanner;
class treeroot {
	
	public static void main(String []args){
		Scanner x = new Scanner(System.in);
		int test = x.nextInt();
		
		for(int i=0; i<test; i++){
			int num = x.nextInt();
			int sum = 0;
			for(int j=0; j<num; j++){
				int t1 = x.nextInt();
				int t2 = x.nextInt();
				sum = sum + (t1-t2);
			}
			System.out.println(sum);
		}
	}

}
