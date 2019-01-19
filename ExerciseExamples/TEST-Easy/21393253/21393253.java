import java.io.*;
import java.util.*;
class first{
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			int n=0;
			while(true){
				n=s.nextInt();
				if(n!=42)
					System.out.println(n);
				else
					return;
			}
		}
}