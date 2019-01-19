import java.util.*;
class treeroot{
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t-->0){
		int n = in.nextInt();
		int sid = 0,scid = 0;
		for(int i=0;i<n;i++){
			sid+=in.nextInt();
			scid+=in.nextInt();
		}
		System.out.println(sid-scid);
	}
}
} 