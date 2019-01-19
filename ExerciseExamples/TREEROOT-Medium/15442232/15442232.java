import java.io.*;
import java.util.*;

class treeroot{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte t = Byte.parseByte(br.readLine());
		int root;
		StringBuilder sb = new StringBuilder();
		while(t-- > 0){
			byte n = Byte.parseByte(br.readLine());
			root = 0;
			while(n-- > 0){
				StringTokenizer st = new StringTokenizer(br.readLine());
				root += Short.parseShort(st.nextToken()) - Short.parseShort(st.nextToken());
			}
			sb.append(root+"\n");
		}
		System.out.println(sb);
		br.close();
	}
}
