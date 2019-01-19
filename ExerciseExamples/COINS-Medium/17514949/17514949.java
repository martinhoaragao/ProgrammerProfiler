import java.util.HashMap;
import java.util.Scanner;

class byteland_coins {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        while(true) {
            try {
                String s = scan.nextLine();
                 n = Integer.parseInt(s);
            } catch (Exception e) {
                break;

            }
            HashMap<Integer,Long> map = new HashMap<>();
            long a = 0;
            long b = 1;


            map.put(0,a);
            map.put(1,b);

            long result = initiate(map,n);
            System.out.println(result);
        }

    }

    private static long initiate(HashMap<Integer, Long> map, int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }

        Long val = Math.max(n,initiate(map,n/2) + initiate(map,n/3) + initiate(map, n/4));
        map.put(n,val);

        return val;
    }
}
