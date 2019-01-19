

import java.util.Scanner;

class LifeTheUniverseAndEverything {
	public static void main(String args[]){
		int arr[]=new int[100];
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<100;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==42){
				break;
			}
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
