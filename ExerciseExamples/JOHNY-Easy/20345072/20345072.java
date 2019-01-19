import java.util.Scanner;
import java.util.ArrayList;

class A{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		//int nosongs  = sc.nextInt();
		int test = sc.nextInt();

		while(test!=0){
			int[] playlist = new int[sc.nextInt()];
			for(int i=0;i<playlist.length;i++){
				playlist[i] = sc.nextInt();
			}
			int favspp = sc.nextInt();
			int favsonglength = playlist[favspp-1];
			for(int i=0;i<playlist.length;i++){
				for(int j=0;j<playlist.length;j++){
					if(i==j){
					
					}else{
						if(playlist[i]<playlist[j]){
							int x = playlist[i];
							playlist[i]=playlist[j];
							playlist[j]=x;
						}
					}
				}
			}
			/*for(int y: playlist){
				System.out.println(y);
			}*/
			int crp = 0;
			for(int i=0;i<playlist.length;i++){
				if(favsonglength==playlist[i]){
					crp = ++i;
					break;
				}
			}
			System.out.println(crp);
			test--;
		}
	}
}