import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t != 0){
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			int index = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++)
				a[i] = Integer.parseInt(st.nextToken());

			int k = Integer.parseInt(br.readLine());

			int num = a[k-1];
			Arrays.sort(a);

			for(int i = 0; i < n; i++){
				if(a[i]==num)
					index = i;
			}
			System.out.println(index+1);

			t--;
		
		}
	}
}