
import java.util.Scanner;
import java.util.Arrays;

 class Uncle_Johny {

	public static void main(String[] args) {
		int testCase,totalNoOfPlayList,testCaseItr,playListItr,uncleJohnyPosition;
		int uncleJohnyInPlayList,findingUncleJohny;
		
		
		Scanner ip=new Scanner(System.in);
		testCase=ip.nextInt();
		for(testCaseItr=1;testCaseItr<=testCase;testCaseItr++){
	
			totalNoOfPlayList=ip.nextInt();
			
			int[] playList=new int[totalNoOfPlayList+1];
			for(playListItr=1;playListItr<=totalNoOfPlayList;playListItr++){
				playList[playListItr]=ip.nextInt();
			}
			
			uncleJohnyPosition=ip.nextInt();
			
			uncleJohnyInPlayList=playList[uncleJohnyPosition];
			
			Arrays.sort(playList);
			
			for(findingUncleJohny=1;findingUncleJohny<=totalNoOfPlayList;findingUncleJohny++){
				if(uncleJohnyInPlayList==playList[findingUncleJohny]){
					System.out.println(+findingUncleJohny);
					break;
				}
			}
			
			
		}

	}

}
