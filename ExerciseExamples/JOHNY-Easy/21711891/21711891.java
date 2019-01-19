

import java.util.Arrays;
import java.util.Scanner;

class UncleJohny {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int len=sc.nextInt();
			int i;
			int arr[]=new int[len];
			for(i=0;i<len;i++){
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int uncle=arr[k-1];
			Arrays.sort(arr);
			for(i=0;i<len;i++){
				if(arr[i]==uncle){
					uncle=i;
				}
			}
			System.out.println(uncle+1);
			t--;
		}
		sc.close();
	}

}
