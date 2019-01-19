import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args){
		MyScanner scan = new MyScanner();
		int t = scan.nextint();
		for(int i=0; i<t; i++){
			int n = scan.nextint();
			int root = 0;
			for(int j=0;j<n;j++){
				int parent = scan.nextint();
				int child = scan.nextint();
				root+=(parent-child);
			}
			System.out.println(root);
		}
		
	}
	
}

class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
    }

    boolean hasNext(){
            if(st.hasMoreElements())
                    return true;
            try {
                    st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                    e.printStackTrace();
            }
            return st.hasMoreTokens();
    }
    String next() {
            while (st == null || !st.hasMoreElements()) {
                    try {
                            st = new StringTokenizer(br.readLine());
                    } catch (Exception e) {
                            e.printStackTrace();
                    }
            }
            return st.nextToken().trim();
    }

    int nextInt() {
            return Integer.parseInt(next());
    }

    int nextint() {
            return Integer.parseInt(next());
    }

    double nextDouble() {
            return Double.parseDouble(next());
    }

    String nextLine(){
            String str = "";
            try {
                    str = br.readLine();
            } catch (IOException e) {
                    e.printStackTrace();
            }
            return str;
    }

    public long nextLong() {
            return Long.parseLong(next());
    }

}