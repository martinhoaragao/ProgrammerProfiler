import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Pratik
 */
class Holes {
    public static int check(String str)
    {
        int no=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A'||str.charAt(i)=='D'||str.charAt(i)=='O'||str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R')
            no+=1;
            else if(str.charAt(i)=='B')
            no+=2;           
        }
        return no;
    }
    public static void main(String[] args) {
        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while(t-->0)
            {
                String str=br.readLine();
                int no=check(str);
                System.out.println(no);
            }
        } catch (IOException | NumberFormatException e) {
        }
    }   
}