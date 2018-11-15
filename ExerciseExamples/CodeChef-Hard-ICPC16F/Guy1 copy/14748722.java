import java.util.*;
import java.io.*;
import java.lang.*;


class TestJava{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i1=0;i1< t;i1++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int d0 = sc.nextInt();
			int d1 = sc.nextInt();

			if((m> d1*n) || (m < d0*n))
				System.out.println(-1);
			else{
				int d = m/n;
				int r = m%n;
				for(int i = 0; i< d; i++){
					for(int j =1; j <= n ; j++){
						int x = (j+i) %n;
						if( x == 0)
							x = n;
						System.out.println(j+" "+ x);
					}
				}
				
				for(int k =1; k<= r;k++){
					int y = (k+d)%n ;
					if(y == 0)
						y = n;
					System.out.println(k+ " "+ y);
				}
				
			}
		}	
	}
}
