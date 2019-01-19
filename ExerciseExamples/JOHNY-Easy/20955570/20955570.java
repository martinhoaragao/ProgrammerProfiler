import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for(int i=0;i<t;i++){
    		int n = sc.nextInt();
    		int[] arr = new int[n];
    		for(int j=0;j<n;j++){
    			arr[j] = sc.nextInt();
    		}
    		int k = sc.nextInt();
    		int res = arr[k-1];
    		arr = sort(arr, n);
    		for(int j=0;j<n;j++){
    			if(arr[j] == res){
    				System.out.println(j+1);
    				break;
    			}
    		}
    	}
    }
    
    public static int[] sort(int[] arr, int n){
    	int t;
    	for(int z=0;z<n-1;z++){
    		for(int x=z+1;x<n;x++){
    			if(arr[z]>arr[x]){
    				t = arr[x];
    				arr[x] = arr[z];
    				arr[z] = t;
    			}
    		}
    	}
    	return arr;
    }
}