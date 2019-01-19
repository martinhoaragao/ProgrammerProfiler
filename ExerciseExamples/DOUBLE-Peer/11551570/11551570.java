import java.util.*;
class AB{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T!=0){
				int s = sc.nextInt();
				if(s%2 == 0){
					System.out.println(s);
				}else{
					System.out.println(s-1);
				}						
		T--;
		}
	}

	
}