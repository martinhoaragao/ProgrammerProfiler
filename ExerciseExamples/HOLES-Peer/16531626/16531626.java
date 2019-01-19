import java.util.Scanner;
class HOLESINTHETEXT {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
      char[] array=new char[7];
      array="ADOPRBQ".toCharArray();
      String word;
      int test=o.nextInt();
      int length=0;
      int count=0;
      while(test > 0)
      {   
    	  count=0;
    	  test--;
    	  word=o.next();
    	  length=word.length();
    	  for(int i=0;i < array.length;i++)
    	  {
    		  for(int j=0 ; j < length ;j++) {
    	
    		  if(array[i] == word.charAt(j))
    		  {
    			  if(array[i] == 'B')
    			  {
    				  count=count+2;
    				  continue;
    			  }
    			  count++;
    		  }
    	  }   	
        } 
    	  System.out.println(count);
	  }
	}
 }
