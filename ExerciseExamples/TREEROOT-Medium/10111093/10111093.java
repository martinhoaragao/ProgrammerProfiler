import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TREEROOT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int test = Integer.parseInt(line);
		for(int i=0;i<test;i++){
			int n = Integer.parseInt(br.readLine());
			int sumNode=0;
			int sumValue=0;
			for(int j=0;j<n;j++){
				String[] arr = br.readLine().trim().split(" ");
				sumNode+=Integer.parseInt(arr[0]);
				sumValue+=Integer.parseInt(arr[1]);
			}
			System.out.println(sumNode-sumValue);
		}
	}

}
