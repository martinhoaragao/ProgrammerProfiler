import java.io.*;
class Solution{
 public static void main(String args[])	throws java.io.IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  PrintWriter pw = new PrintWriter(System.out,true);
  int t = Integer.parseInt(br.readLine());
  while(t-->0){
  	int x = Integer.parseInt(br.readLine());
  	if(x%2==0){pw.println(x);}
  	else {pw.println(x-1);}
  }	
 }
}  