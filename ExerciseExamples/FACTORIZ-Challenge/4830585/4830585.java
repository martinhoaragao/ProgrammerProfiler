import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.math.BigInteger;
class fatFile {

    static int MAXP=170000;
    static BitSet primes = new BitSet(MAXP);
    static ArrayList<Long> ans=new ArrayList<Long>();
    static ArrayList<Long> primeNums=new ArrayList<Long>();
    static PrintWriter out;
    static PrintWriter pout;
    public static void initPrimes() {
        for (int i=2; i<=MAXP; i++) {
            primes.set(i);
        }
        for (int i=2; i<=Math.sqrt(MAXP); i++) {
            if (primes.get(i)) {
                for (int j=2*i; j<=MAXP; j+=i) {
                    primes.set(j, false);
                }
            }
        }
        for(int i=2 ; i<=MAXP ; i++){
            if(primes.get(i)){
               primeNums.add((long)i);
            }
        }
        
    }
    public static void FillAns(long number,int start,int count){
        long next;
        for(int i=start ; i<primeNums.size() && primeNums.get(i)<=Math.sqrt(number);){
                    next=primeNums.get(i);
                    if(number%next==0){
                        ans.add(next);
                        number=number/next;
                        count=0;
                    }else {
                        i++;
                        count++;
                    }
                    if(number==1 || count>600)
                        break;
                }
                if(number!=1)
                    ans.add(number);
    }
    public static void main(String[] args) throws IOException {
        // Start comment
        //long startTime=System.currentTimeMillis();
        //long score=0;
        out=new PrintWriter(System.out);
        //out=new PrintWriter("D:\\Projects\\CodeBlocksCodeChef\\September 2014\\Factorization\\output.txt");
        //System.setIn(new FileInputStream(new File("D:\\Projects\\CodeBlocksCodeChef\\September 2014\\Factorization\\input.txt")));
        //out=new PrintWriter(System.out);
        //end comment
        initPrimes();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        String input;
        long next;
        for (int t=1; t<=T; t++) {
            input=in.readLine();
            ans.clear();
            if(input.length()<18){
                long number=Long.parseLong(input);
                FillAns(number,0,0);
                out.println(ans.size());
                for(int i=0 ; i<ans.size() ; i++)
                    out.println(ans.get(i));
            }
//            else if(t%2==0){
//                
//                out.println(1);
//                out.println(input);
//            }
            else{
                int maxCount;
                if(t%3==1)
                    maxCount=7000;
                else
                    maxCount=300;
                boolean flag=true;
                BigInteger bi=new BigInteger(input);
                int count=0;
                for(int i=0; i<primeNums.size()&& count<maxCount ;){
                    next=primeNums.get(i);
                    if(bi.mod(BigInteger.valueOf(next)).equals(BigInteger.ZERO)){
                        bi=bi.divide(BigInteger.valueOf(next));
                        ans.add(next);
                        count=0;
                    }else {
                       i++;
                       count++;
                       continue;
                    }
                      if(bi.equals(BigInteger.ONE))
                        break;
//                    if(bi.compareTo(BigInteger.valueOf(Long.MAX_VALUE))==-1){
//                        flag=false;
//                        FillAns(bi.longValue(),i,count);
//                        break;
//                    }
                }
                if( flag && !bi.equals(BigInteger.ONE)){
                    out.println(ans.size()+1);
                   // score+=Math.pow(ans.size()+1,2);
                    for(int i=0 ; i<ans.size() ; i++)
                        out.println(ans.get(i));
                    out.println(bi);
                }else {
                    out.println(ans.size());
                    //score+=Math.pow(ans.size()+1,2);
                    for(int i=0 ; i<ans.size() ; i++)
                        out.println(ans.get(i));
                }
            }
        }
        //System.out.println("Score="+score);
        out.flush();
        //System.out.println("ExeTime::"+((System.currentTimeMillis()-startTime)/1000));
    }

}