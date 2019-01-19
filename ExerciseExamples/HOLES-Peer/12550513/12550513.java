import java.util.*;

class HOLES
{
	public static void main(String ar[])
	{
		int no_textcases,size =0 ,counter =0 ,len;
		char ch;
		
		Scanner s = new Scanner(System.in);
	    no_textcases = s.nextInt();	
		
		int[] holes = new int [100];
		String[] text = new String[100];

		for (int i=0;i<no_textcases ;i++ )
	    {
			text[i] = s.next();
		}

		for (int i =0;i<no_textcases ;i++ )
	    {
	    	size=0;
		 	len  = (text[i]).length();
		 	for (int j =0;j<len ;j++ )
		    {
		 		ch = text[i].charAt(j);
		 		if(ch=='A' || ch =='D' || ch == 'O' || ch == 'P' || ch =='Q' || ch =='R' )
		 		{
		 			size++;
		 		}

		 		if(ch=='B')
		 		{
		 			size+=2;
		 		}
		 	}
		 	holes[i] = size;
		}

        for (int i = 0;i<no_textcases ;i++ )
           {
             System.out.println(holes[i]);	
           }   

	}
}
