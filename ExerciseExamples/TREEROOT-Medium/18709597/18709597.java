import java.util.*;
import java.io.*;
class TREEROOT {

    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt( br.readLine() );
            int[][]a=new int[n][2];
              String split[];
              int sum=0;
            for(int i=0;i<n;i++){
              split = br.readLine().split(" ");
                for(int j=0;j<2;j++){
                    a[i][j]= Integer.parseInt(split[j]);     
                }
                sum+=(a[i][0]-a[i][1]);
            }
            System.out.println(sum);
        }
        
    }
    
}
