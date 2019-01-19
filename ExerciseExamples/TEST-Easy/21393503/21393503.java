import java.io.*;

class skip {
	public static void main(String[] args)throws IOException {
		int ch=1,num,flag=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(ch==1) {
			num=Integer.parseInt(br.readLine());
			if(num==42)
				break;;
			if(flag==1)
				continue;
			else 
				System.out.println(num);
		}
	}
}