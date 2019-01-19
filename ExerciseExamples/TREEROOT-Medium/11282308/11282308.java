import java.util.*;
class TreeRoot{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
	while(T-->0){
		int N = sc.nextInt();
		int root=0;
		while(N-->0){
			int id = sc.nextInt();
                        int sum = sc.nextInt();
			root+=id-sum;
		}
		System.out.println(root);
	}
    }	
}