import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        //Scanner sc=new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        try{
            //int t=Integer.parseInt(br.readLine());
            //while(t>0)
            //{
                String s=br.readLine();
                s.trim();
                String a[];
                a=s.split(" ");
                int x;
                float y;
                y=Float.parseFloat(a[1]);
                x=Integer.parseInt(a[0]);
                if((x+0.5)<y && x%5==0)
                {
                    y=y-(x+0.5f);
                }
                
                System.out.printf("%.2f\n",y);
                //t--;
            //}
        }
        catch(Exception e)
        {
            System.out.print(e);
        } 
    }
}