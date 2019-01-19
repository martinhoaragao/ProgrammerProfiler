import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Codechef_Double_Strings {

	public static void main(String[] argts) throws NumberFormatException, IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		int r[]=new int[cases]; 
		for(int n=0; n < cases ;n++){
			int len=Integer.parseInt(bf.readLine());
			r[n]=len%2==0?len:len-1;
		}
		
		for(int i=0; i < cases;i++){
			System.out.print(r[i]);
			if(i!=cases-1)
				System.out.println();
		}
	}//main
}
