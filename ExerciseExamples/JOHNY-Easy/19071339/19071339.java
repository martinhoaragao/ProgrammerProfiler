import java.util.Scanner; 
import java.util.Arrays;
 class Test2
{
    public static void main( String[] args )
    {
int hor,a,l=1,pos,m;
  Scanner s= new Scanner( System.in );
a=s.nextInt();
if(a>=1&&a<=1000){
while(l<=a){
hor=s.nextInt();
if(hor>=1&&hor<=100) {
       s.nextLine();
String input = s.nextLine();
        String[] numbersStr = input.split(" ");
       int[] arr1 = new int[ numbersStr.length ];
for(int i=0;i<numbersStr.length;i++){
if((Integer.parseInt(numbersStr[i])>=1)&&(Integer.parseInt(numbersStr[i])<=Math.pow(10, 9)))
  arr1[i]=Integer.parseInt(numbersStr[i]);
}
pos=s.nextInt()-1;
m=arr1[pos];
 Arrays.sort(arr1);
 int index=0;
for (int i=0; i<arr1.length; i++){
    if (arr1[i] ==m ){
        index = i+1;
    }
}
System.out.println(index);
}
l++;}

}}}

