import java.util.*;

class HOLES{

public static void main(String args[]){

Scanner in=new Scanner(System.in);

          int T;
		T=in.nextInt();

		for(int i=0;i<T;i++){
			String ho=in.next();
				int a1=0;
				int a2=0;
					for(int j=0;j<ho.length();j++){
						if(ho.charAt(j)=='A'||ho.charAt(j)=='D'||ho.charAt(j)=='R'||ho.charAt(j)=='O'||ho.charAt(j)=='P'||ho.charAt(j)=='Q'){
									a1++;
									}else if(ho.charAt(j)=='B'){
										a2=a2+2;
										}
								}
							System.out.println(a1+a2);
						}
				}
		}
