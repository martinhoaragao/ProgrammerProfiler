import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	static long arr[]=new long[100000];
	
    public static void main(String args[]) throws NumberFormatException, IOException{
    	int n;
    	for(int i=0;i<100000;i++)
    		arr[i]=-1;
    	arr[0]=0;
    	arr[1]=1;
    	arr[2]=2;
    	arr[3]=3;
    	arr[4]=4;
    	String input;
    	BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    	while((input= bf.readLine())!=null){
    		if(input.length()==0)break;
    		n=Integer.parseInt(input);
    		
    			System.out.println(cal(n));
    		
    	}
    }
    
    static long cal(int n){
    	long val=0;
    	if(n<100000 && arr[n]!=-1){
    		return arr[n];
    	}
    	else{
    		long sum = cal(n/2)+cal(n/3)+cal(n/4);
    		if(sum>n)
    			val=sum;
    		else
    			val=n;
    		if(n<100000)
    			arr[n]=val;
    	}
    	
    		
    	return val;
    }
	
	
}
 
