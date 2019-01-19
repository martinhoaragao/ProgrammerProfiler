import java.util.*;
import java.io.*;
import java.lang.*;
class Doub{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int y = sc.nextInt();
			if(y==0 || y%2==0)
			System.out.println(y);
			else
			System.out.println(y-1);
		}
	}
}