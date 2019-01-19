import java.util.Scanner;

class Test2 {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-- >0) {
    		int n = sc.nextInt();
    		int[] a = new int[n];
    		for(int i=0;i<n;i++) {
    			a[i]=sc.nextInt();
    		}
    		int k = sc.nextInt();
    		int target = a[k-1],count=0;
    		for(int i=0;i<n;i++) {
    			if(a[i]<target)
    				count++;
    		}
    		System.out.println(count+1);
    	}
    }

    
}