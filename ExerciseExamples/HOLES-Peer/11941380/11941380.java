import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
 
class Codechef
{
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());
        char[] temp;
        StringBuilder ret = new StringBuilder();
        Map<Character, Integer> alphabets = new TreeMap<>();
        alphabets.put('A', 1);
        alphabets.put('B', 2);
        alphabets.put('C', 0);
        alphabets.put('D', 1);
        alphabets.put('E', 0);
        alphabets.put('F', 0);
        alphabets.put('G', 0);
        alphabets.put('H', 0);
        alphabets.put('I', 0);
        alphabets.put('J', 0);
        alphabets.put('K', 0);
        alphabets.put('L', 0);
        alphabets.put('M', 0);
        alphabets.put('N', 0);
        alphabets.put('O', 1);
        alphabets.put('P', 1);
        alphabets.put('Q', 1);
        alphabets.put('R', 1);
        alphabets.put('S', 0);
        alphabets.put('T', 0);
        alphabets.put('U', 0);
        alphabets.put('V', 0);
        alphabets.put('W', 0);
        alphabets.put('X', 0);
        alphabets.put('Y', 0);
        alphabets.put('Z', 0);
        int holes;
        
        while(n-->0) {
            temp = bi.readLine().toCharArray();
            holes=0;
            for(char c : temp) {
                holes+=alphabets.get(c);
            }
            ret.append(holes).append("\n");
        }
        System.out.println(ret);
    }
}
 