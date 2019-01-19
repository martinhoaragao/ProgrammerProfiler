
import java.io.*;
class Treeroot {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int node=0;
		for(int i=0;i<t;i++){
			int sum=0;
			int sumid=0;
			int num=Integer.parseInt(br.readLine());
			
			for(int j=0;j<num;j++){
				String s[]=br.readLine().split(" ");
				sumid+=Integer.parseInt(s[0]);
				sum+=Integer.parseInt(s[1]);		
			}
			System.out.println(sumid-sum);
		}
	}
}
