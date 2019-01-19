import java.util.*;
class heyl{
    static Map<Character,Integer> mp=new HashMap<>();
    public static void main(String[] args){
        for(char i='A';i<'Z';i++){
            if(i=='A' || i=='D' || i=='O' || i=='Q' || i=='P' || i=='R')
                mp.put(i,1);
            else if(i=='B')
                mp.put(i,2);
            else
                mp.put(i,0);
        }
      Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        String str=sc.next().toUpperCase();
        char ch[]=str.toCharArray();
        long sum=0;
        for(char i:ch){
            if(mp.containsKey(i))
            sum+=mp.get(i);
        }
        System.out.println(sum);
    }
    
    }}