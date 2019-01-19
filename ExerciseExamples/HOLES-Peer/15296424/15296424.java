import java.io.*;

class holes{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		byte t = Byte.parseByte(br.readLine());
		byte n[] = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};	
		short sum;
		while(t-->0){
			String s = br.readLine();
			byte l = (byte)(s.length());
			sum = 0;
			while(--l >= 0) sum += n[s.charAt(l)-'A'];
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}