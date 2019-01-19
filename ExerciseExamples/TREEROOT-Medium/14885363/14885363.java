import java.util.Scanner;
public class Main {
		public static void root(Scanner in) {
			int tot_nodes=in.nextInt();
			int val[]=new int[tot_nodes];
			int tot[]=new int[tot_nodes];
			for(int i=0;i<tot_nodes;i++) {
				val[i]=in.nextInt();
				tot[i]=in.nextInt();
			}
			int root_node=0;
			for(int i=0;i<tot_nodes;i++) {
				root_node+=val[i]-tot[i];
			}
			System.out.println(root_node);
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++) {
				root(in);
			}
		}
	
}
