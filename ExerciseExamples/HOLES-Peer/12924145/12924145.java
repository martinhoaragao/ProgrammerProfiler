import java.io.*;

class Holes {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
			int count=0;
			String s=br.readLine();
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)==66){
					count+=2;
				}
				else if(s.charAt(j)=='A' || s.charAt(j)=='D' || s.charAt(j)=='O' || s.charAt(j)=='P' || s.charAt(j)=='Q' || s.charAt(j)=='R'){
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
