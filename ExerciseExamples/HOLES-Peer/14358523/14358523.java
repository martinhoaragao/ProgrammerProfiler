import java.util.*;

class test{

public static void main(String args[]){

		Scanner scanner=new Scanner(System.in);

		int t;

		t=scanner.nextInt();

		String str,st;

		int[] result=new int[t];

		int i,j;

		for(i=0;i<t;i++){

			str=scanner.next();

			result[i]=0;

			for(j=0;j<str.length();j++){

				st=str.substring(j,j+1);
				if(st.equals("B"))
				result[i]=result[i]+2;

				else if(st.equals("A") || st.equals("D") || st.equals("O") || st.equals("P") || st.equals("Q") || st.equals("R"))
				result[i]=result[i]+1;

				else
				System.out.print("");

			};

		}	

		
		
		for(i=0;i<t;i++){
			System.out.println(result[i]);
		}	



}

}