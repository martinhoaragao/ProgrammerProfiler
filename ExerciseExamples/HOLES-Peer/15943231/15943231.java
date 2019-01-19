
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paras
 */
class Holes {
    public static void main(String args[]){
    
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        HashSet<Character> one=new HashSet();
        HashSet<Character> two=new HashSet();
        one.add('D');
        one.add('O');
        one.add('A');
        one.add('P');
        one.add('Q');
        one.add('R');
        two.add('B');
        while(t-->0){
        
            String s=in.next();
            int ans=0;
            for(int i=0;i<s.length();i++){
            
                if(one.contains(s.charAt(i)))
                    ans+=1;
                
                if(two.contains(s.charAt(i)))
                    ans+=2;
            }
            System.out.println(ans);
        }
    }
}
