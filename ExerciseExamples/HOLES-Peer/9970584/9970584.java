import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class HoleCodechef {
    public static void main(String[] args) throws IOException {
        char h[] = {'A', 'R', 'D', 'O', 'P', 'Q', 'R'};
        char h2[] = {'B'};
          BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        for(int i=0; i<t; i++)
        {
            String s = sc.readLine();
            int c = 0;
            for(int j=0; j<s.length(); j++)
            {
                char a = s.charAt(j);
            for(int f=0; f<h.length; f++)
            {
              if(f==0&&a==h2[f])
                {
                    c+=2;
                    break;
                }
                else
                    if(a==h[f])
                    {
                        c+=1;
                        break;
                    }
                
            }
            }
            System.out.println(c);
        }
        
    }
    
}