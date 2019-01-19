
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ajay Goyal
 */
 class RootoftheProblem {
    
    public static void main(String ar[]) throws IOException{
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            int s1=0,s2=0;
            while(n-->0){
                String s[]=in.readLine().split(" ");
                s1+=Integer.parseInt(s[0]);
                s2+=Integer.parseInt(s[1]);
            }
            System.out.println(s1-s2);
        }
}
}