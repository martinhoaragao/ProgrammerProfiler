import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by t-hexiao on 2016/7/24.
 * https://www.codechef.com/problems/ORDERS
 */
public class Main{
    public static int[] solve(ArrayList<Integer> s){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0; i < s.size();i++){
            int left = s.get(i);
            int index = i - left;
            list.add(index,i);
        }
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();

        int[] ret = new int[s.size()];
        for(int i =0; i < list.size();i++){
            ret[list.get(i)] = i + 1;
        }
        return ret;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i =0; i < T; i++){
            int n = in.nextInt();
            ArrayList<Integer> s = new ArrayList<Integer>();
            for(int j =0; j < n; j++){
                int t = in.nextInt();
                s.add(t);
            }
            int[] result = solve(s);
            for(int j =0; j < result.length; j++){
                System.out.print(result[j]+" ");
            }
            System.out.println("");
        }
    }
}