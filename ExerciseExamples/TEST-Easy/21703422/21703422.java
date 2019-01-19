import java.util.*;
import java.lang.*;
class life{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int b =10;
		while(b>0)
		{ 
			int a = Integer.parseInt(s.nextLine());
			if(a != 42)
			System.out.println(a);
			else break;
		}
	}
}