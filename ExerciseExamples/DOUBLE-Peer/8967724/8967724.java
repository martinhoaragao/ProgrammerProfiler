

import java.util.Scanner;



class test {
	 

	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	String str[]= new String[N];
	int[] ans=new int[N];
	

        for(int i=0;i<N;i++){
        	
        	int a=s.nextInt();
        	ans[i]=(a/2)*2;
        	
        	
        }
        for(int i=0;i<N;i++)
    		System.out.println(ans[i]);
        
	}

}
