

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *
 * @author paras
 */
 class coins {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
 
   static HashMap<Long,Long> arr = new HashMap<>();
static void findcoins(long r)
     {
         arr.put(0L,0L);
         arr.put(1L,1L);
         if(r== 0 || r == 1) 
         {
            return ;
         }
         long r2=r/2;
        long r3=r/3;
        long r4=r/4;
        if(arr.get(r2)==null) 
        {
            findcoins(r2);
	}
        if(arr.get(r3)==null) 
        {
	  findcoins(r3);
	}if(arr.get(r4)==null) 
        {
             findcoins(r4);
	}
      long  newcoins=arr.get(r4)+arr.get(r3)+arr.get(r2);
      if(newcoins>r)
      {
         arr.put(r,newcoins);
      }else
      {
         arr.put(r,r);
      }
		
        return ;
    }
	public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
   while(ob.hasNext())
   {
       int num=ob.nextInt();
       findcoins((long)num);
       System.out.println(arr.get((long)num));
       
   }
        }
}
