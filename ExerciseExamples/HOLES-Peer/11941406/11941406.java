import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
 
class Codechef
{
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());
        char[] temp;
        StringBuilder ret = new StringBuilder();
        
        Set<Character> alpha = new HashSet<>();
        alpha.add('A');
        alpha.add('D');
        alpha.add('O');
        alpha.add('P');
        alpha.add('Q');
        alpha.add('R');
        
        int holes;
        
        while(n-->0) {
            temp = bi.readLine().toCharArray();
            holes=0;
            for(char c : temp) {
                if(alpha.contains(c)) {
                    holes+=1;
                } else if (c=='B') {
                    holes+=2;
                }
            }
            ret.append(holes).append("\n");
        }
        System.out.println(ret);
    }
}
 