import java.io.*;

class Holes {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
			int count=0;
			String s=br.readLine();
			for(int j=0;j<s.length();j++){
				switch (s.charAt(j)) {
				case 'A':count++;
				break;
				case 'D':count++;
				break;
				case 'O':count++;
				break;
				case 'P':count++;
				break;
				case 'Q':count++;
				break;
				case 'R':count++;
				break;
				case 'B':count+=2;
				break;
				default:
				break;
				}
			}
			System.out.println(count);
		}
		
	}

}