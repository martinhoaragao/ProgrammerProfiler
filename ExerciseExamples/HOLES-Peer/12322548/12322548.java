import java.util.*;
class Holes
{public static void main(String args[])
{Scanner sc=new Scanner(System.in);
    int t,p,i;String s;char c;
    t=sc.nextInt();
    for(;t>=1;t--)
    {s=sc.next();p=0;
        for(i=0;i<s.length();i++)
        {c=s.charAt(i);
            if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
            p++;
            else if(c=='B')
            p=p+2;
        }
        System.out.println(p);
    }
}
}
