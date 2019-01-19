import java.io.BufferedReader;
 import java.io.InputStreamReader;
 class prac_double {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Long t=Long.parseLong(br.readLine());
        while(t>0)
        {long i=Long.parseLong(br.readLine());
           long answer;
           if(i%2==0)
               answer=i;
           else
               answer=i-1;    
           System.out.println(answer);    
          t--;
        }
    }
    
    
}
