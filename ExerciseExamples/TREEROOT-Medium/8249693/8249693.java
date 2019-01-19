

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static boolean ans[]=new boolean[100000];
		
	public static void main(String cd[]){
			Scanner in=new Scanner(System.in);
			PrintWriter out=new PrintWriter(System.out);
				int t=in.nextInt();
				for(int ii=0;ii<t;ii++){
					int n=in.nextInt();
					int sum=0,sum1=0;
					for(int i=0;i<n;i++){
						sum+=in.nextInt();
						sum1+=in.nextInt();
					}
					out.println(sum-sum1);
				}
			
			out.close();
		}
	}
