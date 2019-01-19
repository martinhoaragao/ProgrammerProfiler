import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
			int s=sc.nextInt();
			if(s==42)	break;
			else	System.out.println(s);
		}
	}
}