import java.util.*;
import java.io.*;

class JohnnyCode{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			List<Integer> arr = new ArrayList<>();
			String str[] = br.readLine().split(" ");
			for(String s : str){
				arr.add(Integer.parseInt(s));
			}

			int k = Integer.parseInt(br.readLine());
			int ind = findJohnny(arr,arr.get(k-1));
			System.out.println((ind+1));
		}
	}

	public static int findJohnny(List<Integer> arr, int e){
		Collections.sort(arr);
		return findJohnny(arr,e,0,arr.size()-1);
	}

	public static int findJohnny(List<Integer> arr, int e, int lo, int hi){
		if(lo <= hi){
			int mid = lo + (hi-lo)/2;
			if(arr.get(mid) == e){
				return mid;
			}
			else if(arr.get(mid) > e){
				return findJohnny(arr,e,lo,mid-1);
			}
			else{
				return findJohnny(arr,e,mid+1,hi);
			}
		}
		return -1;
	}
}