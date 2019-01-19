import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t,n;
        t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
        n=Integer.parseInt(br.readLine());
        n=n/2;
        System.out.println((n+n));
        }
    }
    
}
