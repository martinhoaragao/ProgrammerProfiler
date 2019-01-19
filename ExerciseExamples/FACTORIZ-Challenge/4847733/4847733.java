import java.io.PrintStream;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static final int[] basicPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 
        89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 
        227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 
        373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 
        523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 
        683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 
        859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
    public static final int maxBasicPrime = basicPrimes[basicPrimes.length - 1];
    
    
    static List<Number> solve(BigInteger n) {
        if (n.signum() <= 0) {
            throw new IllegalArgumentException("non-positive argument");
        }
        
        List<Number> components = new LinkedList<Number>();
        if (n.equals(BigInteger.ONE)) {
            components.add(new Integer(1));
        }
        else {
            for (int i = 0; i < basicPrimes.length && !n.equals(BigInteger.ONE); ++i) {                
                n = tryDividing(n, BigInteger.valueOf(basicPrimes[i]), components);                
            }
            
            /*
            if (!n.equals(BigInteger.ONE) && n.compareTo(BigInteger.valueOf(maxBasicPrime * maxBasicPrime)) > 0) {
                
            }
            */
            
            if (!n.equals(BigInteger.ONE)) {
                components.add(n);
            }
        }
        return components;        
    }
    
    private static BigInteger tryDividing(BigInteger n, BigInteger divisor, List<Number> components) {
        boolean keepTrying = true;
        while (keepTrying) {
            BigInteger[] result = n.divideAndRemainder(divisor);
            if (result[1].signum() == 0) {
                components.add(divisor);
                n = result[0];
            } else {
                keepTrying = false;
            }
        }
        return n;
    }
    
    public static void solveAndPrint(BigInteger n, PrintStream out) {
        List<Number> numbers = solve(n);
        out.println(numbers.size());
        for (Number x : numbers) {
            out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; ++i) {         
            solveAndPrint(scanner.nextBigInteger(), System.out);
        }
    }
}
