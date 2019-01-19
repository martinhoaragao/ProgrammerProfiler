import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
class RootOfTheProblem {
	public static void main(String args[])throws NumberFormatException,IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int t = Integer.parseInt(r.readLine());t>0;t--){
			int sum1 = 0;
			int sum2 = 0;
			for(int i = Integer.parseInt(r.readLine());i>0;i--){
				StringTokenizer st = new StringTokenizer(r.readLine()," ");
				sum1+=Integer.parseInt(st.nextToken());
				sum2+=Integer.parseInt(st.nextToken());
			}
			w.write(sum1-sum2+"\n");
		}
		w.flush();
	}
}