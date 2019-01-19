import java.util.*;

public class Main {

    static Map<Long,Long> solutions = new HashMap<Long,Long>();
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Long num = Long.parseLong(in.nextLine());
            System.out.println(solve(num)); 
        }
        in.close();
    }

    public static Long solve(Long n) {
        if (n < 12) {
            return n;
        }
        
        if (solutions.containsKey(n)) {
            return solutions.get(n);
        }

        Long coinSum = solve(Math.floorDiv(n, 2)) + solve(Math.floorDiv(n, 3)) + solve(Math.floorDiv(n, 4));
        Long solution = Math.max(n, coinSum);
        solutions.put(n, solution);
        return solution;
    }
}