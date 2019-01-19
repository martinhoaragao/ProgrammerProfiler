import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			if(a!=42)
				System.out.println(a);
			else 
				break;
		}
		sc.close();
	}
}
