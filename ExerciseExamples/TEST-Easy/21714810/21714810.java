import java.util.*;
class Life{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; ; i++){
			int a = sc.nextInt();
			if(a!=42){
				System.out.println(a);
			}
			else{
				break;
			}
		}
	}
}