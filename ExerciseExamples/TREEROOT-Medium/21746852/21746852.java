import java.io.*;
class Solution{
    public static void main(String args[]) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        
        while(t--!=0){
            int n=Integer.parseInt(in.readLine());
            
            int suma=0,sumb=0;
            for(int i=0;i<n;i++){
                String temp[]=in.readLine().split(" ");
                suma+=Integer.parseInt(temp[0]);
                sumb+=Integer.parseInt(temp[1]);
            }
            
            System.out.println(suma-sumb);
        }
    }
}