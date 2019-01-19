
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class New {
	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pWriter = new PrintWriter(System.out);
		String testCasesStr;
		int n=0;
		try {
			testCasesStr = bReader.readLine();
			if (testCasesStr != null && !testCasesStr.equals("") && testCasesStr.length() > 0) {
				int testCases = Integer.parseInt(testCasesStr);
				int[] result = new int[testCases];
				for(int y=0; y<testCases; y++) {
					n = Integer.valueOf(bReader.readLine());
					int[] ele = new int[n];
					int sume = 0;
					int sumi = 0;
					for(int i=0; i<n; i++) {
						String[] nm = bReader.readLine().split(" ");
						ele[i] = Integer.valueOf(nm[0]);
						sumi = sumi + ele[i];
						sume = sume + Integer.valueOf(nm[1]);
					}
					
					for(int j=0; j<n; j++) {
						if((sumi - ele[j]) == sume) {
							result[y] = ele[j];
							break;
						}
					}
				}
				for(int i=0; i<testCases; i++) {
					pWriter.println(result[i]);
				}
			}
		} catch (IOException e) {
			pWriter.println(e.getMessage());
		}

		pWriter.flush();

	}

}
