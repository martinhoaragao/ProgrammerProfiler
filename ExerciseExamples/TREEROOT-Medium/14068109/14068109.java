import java.util.Scanner;
 class TreeRoot {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
			
			int n = sc.nextInt();
			int id_sum=0; int child_sum=0;
			for(int i=0;i<n;i++){
				id_sum += sc.nextInt();
				child_sum += sc.nextInt();
				
			}
			System.out.println(id_sum-child_sum);
			
		}
		
		
		
	}
	
	
}
