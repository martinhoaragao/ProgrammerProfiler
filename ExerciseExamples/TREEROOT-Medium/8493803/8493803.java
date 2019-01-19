
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankaj agrawal
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   PrintWriter pw = new PrintWriter (new OutputStreamWriter(System.out));
   int t = Integer.parseInt(br.readLine()); 
   while(t-->0)
   {
      int N= Integer.parseInt(br.readLine());
      int sum=0;
       for (int i = 0; i < N; i++) {
           StringTokenizer st=new StringTokenizer(br.readLine());
           int m1=Integer.parseInt(st.nextToken());
           int m2=Integer.parseInt(st.nextToken());
           sum+=(m1-m2);
           
           
       }
       pw.println(sum);
     }
   pw.close();
   
}
}
