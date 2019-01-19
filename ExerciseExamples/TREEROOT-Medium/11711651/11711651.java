import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Root_of_Problem {
	public static void main(String args[]) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String s;
	
		s = reader.readLine();
		 int T = Integer.parseInt(s);
		 int[] id = new int[35];
		 int[] sum = new int[35];
         for (int t=0; t<T; t++) {
        	 int total=0;
        	 int n=Integer.parseInt(reader.readLine());
        	 for(int i=0;i<n;i++){
        		 
        		 String s1=reader.readLine();
        		 String[] str=s1.trim().split(" ");
        		 id[i]=Integer.parseInt(str[0]);
        		 sum[i]=Integer.parseInt(str[1]);
        		 total=total+id[i]-sum[i];
        		  }
        	 System.out.println(total);
}

	}
}
