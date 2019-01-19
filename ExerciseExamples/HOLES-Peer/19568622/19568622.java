import java.util.Scanner;
 
class Myproject {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int k=1;k<=T;k++)
        {
        String text=sc.nextLine();
            
         int holes=0;
        for(int j=0;j<text.length();j++){
            
             char ch=text.charAt(j);
            if(ch=='A' || ch=='D' || ch=='P'  || ch=='Q' || ch=='R' || ch=='O' )
                
            {
                holes++;
            }
            else if(ch=='B')
                    {
                        holes=holes+2;
                        
                    }
          
        }
        System.out.println(holes);
        
        }
                           
    }
    
}
 
