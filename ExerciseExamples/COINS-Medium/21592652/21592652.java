import java.util.*;
class bytelandiancoin{
    HashMap<Long,Long> map=new HashMap<Long,Long>();
    public void go(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            long n=sc.nextLong();
            long result=calculate(n);
            System.out.println(result);
        }
    }
    public long calculate(long n){
        if(n>11){
            if(map.containsKey(n)){
                return map.get(n);
            }
            long num=calculate(n/2)+calculate(n/3)+calculate(n/4);
            map.put(n,num);
            return num;
        }
        else{
            return n;
        }
    }
    public static void main(String[] args){
        new bytelandiancoin().go();
    }
}