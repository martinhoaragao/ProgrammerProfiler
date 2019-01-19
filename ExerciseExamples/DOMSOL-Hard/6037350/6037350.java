import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader read = new BufferedReader(new InputStreamReader(
			System.in));
	static BufferedWriter write = new BufferedWriter(new OutputStreamWriter(
			System.out));

	static int[][] arr;
	static int q;
	
  static int[] maxi;

	public static void main(String[] args) throws IOException {

		int l = 0;
		int r = 0;
		int score=0;
		 q = strToInt(read.readLine());
		 maxi= new int[q+1];
		arr = new int[q][2];
		String[] l_r = read.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			arr[i][0]=strToInt(l_r[i]);		

		}
		 l_r = read.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			arr[i][1]=strToInt(l_r[i]);		

		}		
		score = max(arr, 0);

		/* for(int i =0;i<q;i++)
		 {
		 System.out.print(arr[i][0]+" ");
		 }
		 System.out.println();
		 {
		 System.out.print(arr[i][1] + " ");
		 }for(int i =0;i<q;i++)
		 

		 System.out.println();
		 System.out.println();*/
		write.write(score+"\n");
		write.flush();
	}
	
	public static int max(int[][] arr, int index)
	{
		//int out = 0;
		
		// check for only one column two colum and zero column
		maxi[q-1]= absolute(arr[q-1][0],arr[q-1][1]);
		maxi[q]=0; 
		for(int i=q-2;i>=0;i--)
		{
			maxi[i]=max_of_two(absolute(arr[i][0],arr[i][1])+maxi[i+1], maxi[i+2]+absolute(arr[i][0],arr[i+1][0])+absolute(arr[i][1],arr[i+1][1]));
		}
		
		return maxi[0];
		
	}
	
	public static int  absolute(int a , int b)
	{
		int x = a-b;
		return x>=0?x:(-x);
	}
	
	public static int max_of_two(int a ,int b)
	{
		return a>b?a:b;
	}

	public static long strToLong(String str) {
		int i = 0;
		long num = 0;
		boolean isNeg = false;

		// Check for negative sign; if it's there, set the isNeg flag
		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		}

		// Process each character of the string;
		while (i < str.length()) {
			num *= 10;
			num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get
											// the value of the charAt(i++).
		}

		if (isNeg)
			num = -num;
		return num;
	}

	public static int strToInt(String str) {
		int i = 0;
		int num = 0;
		boolean isNeg = false;

		// Check for negative sign; if it's there, set the isNeg flag
		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		}

		// Process each character of the string;
		while (i < str.length()) {
			num *= 10;
			num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get
											// the value of the charAt(i++).
		}

		if (isNeg)
			num = -num;
		return num;
	}
}
