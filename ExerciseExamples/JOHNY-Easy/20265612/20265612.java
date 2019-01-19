import java.util.Arrays;
import java.util.Scanner;

 class Icpc {


			public static void main(String[] args) {
			Scanner input=new Scanner(System.in);

			int t,i;
			t=input.nextInt();
			while(t>0) {
				int a;
				a=input.nextInt();
				long n[]=new long[a];
				for( i=0;i<a;i++) 
					n[i]=input.nextInt();
					int pos=input.nextInt();
				       long song=n[pos-1];
				       Arrays.sort(n);
				       for(i=0;i<a;i++) {
				    	   if(song==n[i]) {
				    		   System.out.println(i+1);
				    		   break;
				    	   }
				       
				}
				t--;
			}
			}
			}