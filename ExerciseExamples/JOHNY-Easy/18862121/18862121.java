import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
//import java.ArrayList.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        try{
        int t,n,k,index=0;
        
                t=sc.nextInt();
        
        while(t>0){
    
        n=sc.nextInt();
        
        List<Integer> unsortedList= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        unsortedList.add(sc.nextInt());
        }
        
                k=sc.nextInt();
        int a=unsortedList.get(k-1);
        Collections.sort(unsortedList);
    
        

         Iterator itr=unsortedList.iterator();
         while(itr.hasNext()){
             
                 //System.out.println("jvfjdh"+unsortedList);
                    if((itr.next()).equals(a)){
                 index= unsortedList.indexOf(a);
                  System.out.println(index+1);
                 break;
                    }
                    else{
                        //do nothing
                    }
                    
                         
         }
         
   
         
         t--;
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
}
