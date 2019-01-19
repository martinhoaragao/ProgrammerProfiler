import java.util.*;


class HelloWorld {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++) {
        	int n = sc.nextInt();
        	
        	int [] arr = new int [n];
        	int pos;
        	int song;
        	
        	for(int j=0; j<n; j++) {
        		arr[j] = sc.nextInt();
        	}
        	
        	pos = sc.nextInt();
        	song = arr[pos-1];
        	Arrays.sort(arr);
        	
        	for(int j=0; j<n; j++) {
        		if(arr[j] == song) {
        			System.out.println(j+1);
        		}
        	}
        }		      
	}

}