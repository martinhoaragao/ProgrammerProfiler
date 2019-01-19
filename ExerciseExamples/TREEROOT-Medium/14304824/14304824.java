import java.util.Scanner;
 
class TREEROOT{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0){
			int n = input.nextInt();
			int root=0;
			while(n-->0){
				int x = input.nextInt();
				int y = input.nextInt();
				root = x-y+root;
			}
			System.out.println(root);
		}
	}
}
 