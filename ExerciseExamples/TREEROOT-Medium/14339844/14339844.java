import java.io.*;
import java.util.*;
class Solution{
    
public static void main(String args[]) throws IOException
{ Scanner s=new Scanner(System.in);
 int t=s.nextInt();
 for(int ii=0;ii<t;ii++){
 	int n=s.nextInt();
     long e=0;
     long c=0;
     for(int i=0;i<n;i++){
         e += s.nextInt();
         c += s.nextInt();
         
     }
     System.out.println(e-c);
 	}
 s.close();
}
}