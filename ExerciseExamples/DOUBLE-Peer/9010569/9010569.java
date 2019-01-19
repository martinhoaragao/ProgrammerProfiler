import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class MaximalCharInDoubleString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int noOftestCases=0;
		int presentPalinLen=0;
		List<Integer> outPutList = new ArrayList<Integer>();
		
		BufferedReader ipStreamBuffReader = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Please Enter No Of Test Cases :");
		noOftestCases=Integer.parseInt(ipStreamBuffReader.readLine());
		
		
			for(int i=1;i<=noOftestCases;i++) {
			
			//System.out.print("Please Enter Lenth Of The Palindrome :");
			presentPalinLen=Integer.parseInt(ipStreamBuffReader.readLine());
			
			if((presentPalinLen%2)!=0){//means odd length.
				
				outPutList.add(presentPalinLen-1);
				
			}
			else {
				
				outPutList.add(presentPalinLen);
			}
			
		}
		
		for (Iterator<Integer> outPutListIterator = outPutList.iterator(); outPutListIterator.hasNext();) {
			
			System.out.println(outPutListIterator.next());
		}
	}

}

