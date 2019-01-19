
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Treeroot {
	public static void main(String args[]) throws IOException{
		Treeroot tree = new Treeroot();
		tree.run();
	}
	public void run() throws IOException{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    int noOfcases= Integer.parseInt(inp.readLine());
	    for(int i=0;i<noOfcases;i++){
	    	int n= Integer.parseInt(inp.readLine());
	    	int sumid =0;
	    	int sumchild=0;
	    	for(int j=0;j<n;j++){
		    	String[] s= inp.readLine().split(" ");
		    	sumid=sumid+Integer.parseInt(s[0]);
		    	sumchild=sumchild+Integer.parseInt(s[1]);
	    	}
	    	int result = sumid-sumchild;
	    	System.out.println(result);
	    }
	    	
	}  
}