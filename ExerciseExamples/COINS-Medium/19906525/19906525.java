
import java.io.*;
import java.util.*;

/**
 *
 * @author Ajay Goyal
 */
class Bytelandiangoldcoins {
    static Map<Long,Long> map= new HashMap<>();
    public static void main(String ar[]) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=in.readLine())!=null){
            long res = find(Long.parseLong(line));
//            System.out.println(map);
            System.out.println(res);
        }
    }
    private static long find(long num) {
        if(num<=2)return num;
        if(!map.containsKey(num)){
            map.put(num, Math.max(num,
                    find(num/2)+find(num/3)+find(num/4)));
        }
        return map.get(num);
    }
}