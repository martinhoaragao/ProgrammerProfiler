import java.util.*;
class Johny{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0;i<testcases;i++){
			int nos = sc.nextInt();
			int[] arr= new int[nos];
			for(int j =0;j<nos;j++){
				arr[j]=sc.nextInt();
			}
			int favSo = arr[(sc.nextInt())-1];
			Arrays.sort(arr);
			for(int j =0;j<nos;j++){
				if(arr[j]==favSo){
					System.out.println(j+1);
					break;
				}
			}
			
		}
	}

}
