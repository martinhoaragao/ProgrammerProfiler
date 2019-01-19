import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Orders
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String u = scan.readLine();
        int t = Integer.parseInt(u);
        for(int q = 0; q<t; q++)
        {
            String m = scan.readLine();
            int n = Integer.parseInt(m); 
            int temp = 0;
            ArrayList<Integer> input = new ArrayList<Integer> ();
            ArrayList<Integer> ans = new ArrayList<Integer> ();
            String line = scan.readLine();
            String[] token = line.split(" ");
            for(int i = 0; i<n; i++)
            {
                ans.add(i+1);
                input.add(Integer.parseInt(token[i]));
                if(input.get(i)!=0)
                {
                    temp=input.get(i);
                    input.remove(i);
                    input.add(i-temp, temp);
                }
            }
            for(int i=n-1;i>-1;i--)
            {
                if(input.get(i)!=0)
                {
                    temp=ans.get(i);
                    ans.remove(i);
                    ans.add(i+input.get(i),temp);
                }
            }
            System.out.println(ans.toString().replace("[","").replace(",","").replace("]",""));
        }
    }
} 