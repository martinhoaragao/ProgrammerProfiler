import java.util.*;
class holes {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int l = s.length();
            int c = 0;
            while (l-- > 0) {
                if ((s.charAt(l) == 'A') || (s.charAt(l) == 'D') || (s.charAt(l) == 'O') || (s.charAt(l) == 'P') || (s.charAt(l) == 'Q') || (s.charAt(l) == 'R'))
                    c++;
                else if (s.charAt(l) == 'B')
                    c += 2;
            }
            System.out.println(c);
        }}}
