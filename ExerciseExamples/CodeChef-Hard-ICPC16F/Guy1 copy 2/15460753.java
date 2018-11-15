import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
    static int flag=0;
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int D=Integer.parseInt(st.nextToken());
            int temp=m/n*n;
            int t_d=temp/n;
            int t_D=0;
            if(m>temp){
                t_D=d+1;
            }
            else{
                t_D=d;
            }
            int count=0;
            if(D*n<m || d*n>m){
                System.out.println(-1);
            }
            else{
                for(int i=0;i<t_d;i++){
                    for(int j=1;j<=n;j++){
                        int tt=j+i;
                        if(tt>n)
                            tt-=n;
                        System.out.println(j+" "+((tt)));
                        count++;
                    }
                }
                int x=1;
                int tempo=t_d;
                while(count<m){
                    //t_d++;
                    //t_d%=n;
                    int tt=x+tempo;
                    if(tt>n){
                        
                        tempo=t_d;
                        tt-=n;
                    }
                    System.out.println(x+" "+(tt));
                    count++;
                    x++;
                    //tempo++;
                }
            }
            
        }
    }
}