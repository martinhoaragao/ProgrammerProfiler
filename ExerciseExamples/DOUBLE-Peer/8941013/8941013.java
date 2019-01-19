import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner abd = new Scanner(System.in);
		try{
			int test = abd.nextInt()-1;
			do{
				int n=abd.nextInt();
				if (n%2==1){
					System.out.println(n-1);
				}else{
					System.out.println(n);
				}
			}while(test-->0);
		}catch(Exception e){
			return;
		}
	}
}


