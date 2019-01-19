import java.util.*;
class Trial{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
       int T = Sc.nextInt();
       while(T-->0)
       {
        int count = 0;
        String s = Sc.next();
        s = s.toUpperCase();
         ArrayList<Character>list = new ArrayList<Character>(s.length());
        for(int c = 0; c < s.length();c++)
        {
            char ab = s.charAt(c);
            list.add(ab);
        }
    for(int c = 0;c<s.length();c++)
    {
        char main = list.get(c);
        if(main == 'A' || main == 'D'|| main == 'O' ||main == 'P' ||main == 'Q'||main == 'R')
        {
        count++;
    }
    else if(main =='B')
    {
        count++;
        count++;
    }
    }
    System.out.println(count);
    }
  }
}