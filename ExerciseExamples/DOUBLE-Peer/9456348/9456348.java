import java.io.*;
class Double{
	public static void main(String[] aa) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Integer T = new Integer(br.readLine());
		for(int c=0;c<T;c++){
			Long N = new Long(br.readLine());
			if(N%2==0){
				System.out.println(N);
			}
			else{
				System.out.println(N-1);
			}
		}
	}
}