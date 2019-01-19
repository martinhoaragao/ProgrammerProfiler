import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Shiwakant Bharti
 * @start 14-Sep-2014 : 9:31:12 pm
 * @accepted
 * @deltamins
 * @description
 * 
 */
class FactorizationBrute_2 {
    public static boolean[] isNonPrime;
    public static int[] primeList;
    public static int index;
    public static final int MAX = 1000000;

    public static void initilizePrime(int N) {
        isNonPrime = new boolean[N + 1];
        primeList = new int[N / 10];

        isNonPrime[0] = isNonPrime[1] = true;

        for (int i = 2; i < N; i++) {
            if (isNonPrime[i]) {
                continue;
            }
            for (int j = 2 * i; j <= N; j += i) {
                isNonPrime[j] = true;
            }
        }

        // Build the primeList
        index = 0;
        for (int i = 2; i <= N; i++) {
            if (isNonPrime[i] == false) {
                primeList[index++] = i;
            }
        }
    }

    // This is very slow or what?
    // public static long countNumberOfDivisors(long N, long SQRTN) {
    // long count = 0;
    // for (long i = 0; i <= SQRTN && ; i++) {
    // // Check divisibility
    // if ((N / i) * i == N) {
    // count += 2;
    // }
    // }
    //
    // if (SQRTN * SQRTN == N) {
    // count--;
    // }
    //
    // return count;
    // }

    // A faster way via prime divisors!
    // public static long countNumberOfDivisors2(long N, long SQRTN) {
    // long count = 1, factorCount, divisor;
    // int i = 0;
    // while (i < index) {
    // factorCount = 0;
    // divisor = primeList[i];
    // while (N > 0 && N % divisor == 0) {
    // factorCount++;
    // N /= divisor;
    // }
    //
    // count = count * (factorCount + 1);
    // }
    //
    // return count;
    // }

    // N - SQRTN algo?
    // public static boolean isPrimeNumberOfDivisors(long N, long SQRTN) {
    // long count = countNumberOfDivisors(N, SQRTN);
    // if (count <= MAX) {
    // return !isNonPrime[(int) count];
    // } else {
    // for (int i = 0; i < index; i++) {
    // if (N % primeList[i] == 0) {
    // return false;
    // }
    // }
    //
    // // No factor found!
    // return true;
    // }
    // }

    // public static long process(long L, long R) {
    // long count = 0;
    //
    // long SQRTN = (long) Math.sqrt(L + 0.1);
    // long SQRTN_1 = SQRTN + 1;
    // // for (long N = L; N <= R; N++) {
    // // if (SQRTN_1 * SQRTN_1 <= N) {
    // // SQRTN_1++;
    // // SQRTN++;
    // // }
    // // if (isPrimeNumberOfDivisors(N, SQRTN)) {
    // // count++;
    // // }
    // // // System.out.println(count);
    // // // count += countNumberOfDivisors(N, SQRTN);
    // // }
    //
    // count = countNumberOfDivisors(L, SQRTN);
    //
    // return count;
    // }

    public static final BigInteger LongMaxValue = new BigInteger("1000000000000000");

    public static void readAndProcess() {
        try {
            initilizePrime(MAX);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    System.out));

            int T = Integer.parseInt(br.readLine());

            BigInteger bigN;
            long N;
            ArrayList<Long> divisorsList;

            ArrayList<BigInteger> bigDivisorsList;
            for (int t = 0; t < T; t++) {
                bigN = new BigInteger(br.readLine());

                if (bigN.compareTo(LongMaxValue) < 0) {
                    N = bigN.longValue();
                    divisorsList = processN(N);
                    bw.write(Integer.toString(divisorsList.size()));
                    bw.newLine();
                    for (int i = 0; i < divisorsList.size(); i++) {
                        bw.write(Long.toString(divisorsList.get(i)));
                        bw.newLine();
                    }

                } else {
                    bw.write(BigInteger.ONE.toString());
                    bw.newLine();
                    bw.write(bigN.toString());
                    bw.newLine();

                    // bigDivisorsList = processBigInteger(bigN);
                    // bw.write(Integer.toString(bigDivisorsList.size()));
                    // bw.newLine();
                    // for (int i = 0; i < bigDivisorsList.size(); i++) {
                    // bw.write(bigDivisorsList.get(i).toString());
                    // bw.newLine();
                    // }
                    //

                }

            }

            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Long> processN(long N) {
        ArrayList<Long> result = new ArrayList<Long>();

        long SQRTN = (long) Math.sqrt(N);
        for (long i = 0; primeList[(int) i] <= SQRTN;) {
            // Check divisibility
            if ((N / primeList[(int) i]) * primeList[(int) i] == N) {
                result.add((long) primeList[(int) i]);
                N = N / primeList[(int) i];
                SQRTN = (long) Math.sqrt(N);
                i = 0; // reset i
            } else {
                i++; // go to the next element
            }
        }

        // Add the last processed number itself
        result.add(N);

        return result;

    }

    // public static ArrayList<BigInteger> processBigN(BigInteger bigN){
    // ArrayList<Long> result = new ArrayList<Long>();
    //
    // int i = 0;
    // BigInteger bigPL;
    // for (bigPL = new BigInteger("" + primeList[i]); bigPL.compareTo(bigN) < 0
    // ; i++) {
    // // Check divisibility
    // if ((bigN.divide(bigPL).multiply(bigPL)].equals(bigN)) {
    // result.add((long) primeList[(int) i]);
    // N = N / primeList[(int) i];
    // SQRTN = (long) Math.sqrt(N);
    // i = 0;
    // }
    // bigPL = new BigInteger("" + primeList[i]);
    // }
    //
    // return result;
    //
    // }
    public static void main(String[] args) {
        readAndProcess();
    }
}
