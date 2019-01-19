import java.io.*;

class Double {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());
			if(n%2==0){
				System.out.println(n);
			}
			else{
				System.out.println(n-1);
			}
		}
	}
}