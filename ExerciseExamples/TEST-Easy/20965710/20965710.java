import java.util.*;

public class Main {

    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();
        
        while(true) {
            int n = in.nextInt();
            if(n == 42) break;
            ans.add(n);
        }
        
        Iterator<Integer> ansIter = ans.iterator();
        while(ansIter.hasNext()) {
            System.out.println(ansIter.next());
        }
    }
}