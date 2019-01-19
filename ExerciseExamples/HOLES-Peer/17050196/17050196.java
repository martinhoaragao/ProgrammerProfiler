import java.util.Scanner;
 
class Speed {
 
 
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        for(int i=0;i<t;i++)
        { 
            int hole=0;
          String s=sc.next();
          char ch[]=s.toCharArray();
          for(char a : ch)
          {
              if(a=='A'||a=='D'||a=='O'||a=='P'||a=='Q'||a=='R')
              
                    hole++;
              
            
              else if(a=='B')
                      hole=hole+2;
          }
          System.out.println(hole);
 
         }
            
    }
    
}