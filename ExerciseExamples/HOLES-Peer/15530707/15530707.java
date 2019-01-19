import java.util.Scanner;
 
 
class Holes {
 
   
    public static void main(String[] args) {
        int n;
        int i;
        int count=0;
        String str[]=new String[100];
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            str[i]=s.next();
        }
        for(i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<str[i].length();j++)
            {
            if(str[i].charAt(j)=='B')
            {
                count=count+2;
            }
            else if(str[i].charAt(j)=='A')
            {
                count++;
            }
            else if(str[i].charAt(j)=='D')
            {
                count++;
            }
            else if(str[i].charAt(j)=='O')
            {
                count++;
            }
            else if(str[i].charAt(j)=='P')
            {
                count++;
            }
            else if(str[i].charAt(j)=='R')
            {
                count++;
            }
            else if(str[i].charAt(j)=='Q')
            {
                count++;
            }
            }
            System.out.println(count);
            
        }
    }
    
}
 