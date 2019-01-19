import java.io.*;
import java.util.*;
import java.math.*;

class COINS 
{
    static HashMap<BigInteger, BigInteger> map=  new HashMap<>();
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        while(in.hasNext())
        {
            String num = in.next();
            BigInteger ans= recur(new BigInteger(num));
            System.out.println(ans);
        }
    }
    public static BigInteger recur(BigInteger num)
    {
        if(num.compareTo(new BigInteger("2"))==-1)
        return num;
        if(!map.containsKey(num))
        {
            //map.put(num, Math.max(num, recur((long)Math.floor(num/2))+ recur((long)Math.floor(num/3))+ recur((long)Math.floor(num/4))));
            map.put(num, num.max(recur(num.divide(new BigInteger("2"))).add(recur(num.divide(new BigInteger("3")))).add(recur(num.divide(new BigInteger("4"))))));
        }
        return map.get(num);
    }
}