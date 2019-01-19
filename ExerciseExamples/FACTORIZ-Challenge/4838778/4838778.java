import java.math.*;
import java.io.*;
import java.util.*;
class Main{
static BigInteger zero=BigInteger.valueOf(0L);
static BigInteger one=BigInteger.valueOf(1L);
static BigInteger two=BigInteger.valueOf(2L);
static BigInteger three=BigInteger.valueOf(3L);
static int NL=1200,MX=131072,END=200000000;
static int[]P=new int[50000];
static int[]Chk=new int[MX];
static long ffl=0xFFFFFFFFL,Mi=1000000000,MonMulN,yFreq,fff=0x7FFFFFFFL,TM,Tsup=5200;
static int ff8=0x7FFFFFFF;
static int NumLen,EC,stECM,idM,mIdM,nbrprm,idprm,karaLen,cn,Pn;
static int CAGCDU[]=new int[NL];
static int CAGCDV[]=new int[NL];
static int CAGCDT[]=new int[NL];
static long CAMInvA[]=new long[NL];
static long CAMInvB[]=new long[NL];
static long CAMInvBB[]=new long[NL];
static long CAMInvMu[]=new long[NL];
static long CAMGam[]=new long[NL];
static int TNbr[]=new int[NL];
static int KaraTNbr[]=new int[NL];
static long TNbr2[]=new long[NL];
static int GCDACC[]=new int[NL];
static int[]FAA,FTX,FTZ,FUX,FUZ,fAux1,fAux2,fAux3,fAux4;
static long Bit32=(long)1<<32,Bit31=(long)1<<31;
static long Bit311=Bit31-1,Bit63=Bit32*Bit31;
static double dBit31=(double) Bit31;
static double dBit62=dBit31*dBit31,dN;
static int BigNbr1[]=new int[NL];
static int SP[]=new int[670];
static int MonMul1[]=new int[NL];
static int MonMul2[]=new int[NL];
static int MonMulAInv[]=new int[NL];
static int[]aNbr=new int[4*NL];
static int[]aNbrM=new int[4*NL];
static int[]aNbrAux=new int[4*NL];
static int[]monkara=new int[2*NL];
static int[][]Val=new int[105][3005];
static int[]Ren=new int[105];
static BigInteger TFac;
static BigInteger[]val=new BigInteger[105];
static BigInteger[][]res=new BigInteger[105][300];
static int[]Cn=new int[105];
static int LIM[]={5,8,15,25,25,27,32,43,70,150,300,350,600 };
static int NbrToInt(BigInteger N,int TNbr[]){
byte[]Result;
long[]Temp;
int i,j,mask,NumLen;
long p;
Result=N.toByteArray();
NumLen=(Result.length*8+30)/31;
Temp=new long[NumLen+1];
j=0;mask=1;p=0;
for(i=Result.length-1;i>=0;i--){
p+=mask*(long)(Result[i]>=0?Result[i]:Result[i]+256);
mask<<=8;
if(mask==0){
Temp[j++]=p;
mask=1;
p=0;
}
}
Temp[j]=p;
C32To31(Temp,TNbr,NumLen);
if(TNbr[NumLen-1]>Mi){
TNbr[NumLen]=0;
NumLen++;
}
TNbr[NumLen]=0;
return NumLen;
}
static void GetYFreq(){
yFreq=1000000/(NumLen*NumLen);
if(yFreq>100000) yFreq=yFreq/100000*100000;
else if(yFreq>10000) yFreq=yFreq/10000*10000;
else if(yFreq>1000) yFreq=yFreq/1000*1000;
else if(yFreq>100) yFreq=yFreq/100*100;
}
static void MonMult(int Nbr1[],int Nbr2[],int Prod[]){
switch(NumLen){
case 2:
MonMult2(Nbr1,Nbr2,Prod);
break;
case 3:
MonMult3(Nbr1,Nbr2,Prod);
break;
case 4:
MonMult4(Nbr1,Nbr2,Prod);
break;
case 5:
MonMult5(Nbr1,Nbr2,Prod);
break;
case 6:
MonMult6(Nbr1,Nbr2,Prod);
break;
case 7:
MonMult7(Nbr1,Nbr2,Prod);
break;
case 8:
MonMult8(Nbr1,Nbr2,Prod);
break;
case 9:
MonMult9(Nbr1,Nbr2,Prod);
break;
case 10:MonMult10(Nbr1,Nbr2,Prod);
break;
case 11:MonMult11(Nbr1,Nbr2,Prod);
break;
default:LMonMult(Nbr1,Nbr2,Prod);
break;
}
}
static void MinBNbrModN(int Nbr1[],int Nbr2[],int Diff[],int TNbr[],int NumLen){
long MUint=fff;
long cry=0;
int i;
for(i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Nbr1[i]-(long)Nbr2[i];
Diff[i]=(int)(cry&MUint);
}
if(cry<0){
cry=0;
for(i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Diff[i]+(long)TNbr[i];
Diff[i]=(int)(cry&MUint);
}
}
}
static void MIBNbr(int[] a,int[] inv,int[] b,int NumLen){
int i,Dif,E,st1,st2,Iaa,Iab,Iba,Ibb,B0l,invB0l,Al,Bl,T1,Gl,Ml,P,Yaah,Yabh,Ybah,Ybbh,Ymb0h,Ygb0h;
long Yaa,Yab,Yba,Ybb,Ygb0,Ymb0,Tmp1,Tmp2,Tmp3,Tmp4,Tmp5,cry1,cry2,cry3,cry4,Pr1,Pr2,Pr3,Pr4,Pr5,Pr6,Pr7;
long[] B=CAMInvBB;
if(NumLen>=2&&b[NumLen-1]==0&&b[NumLen-2]<0x40000000) NumLen--;
C31To32(a,CAMInvA,NumLen);
C31To32(b,CAMInvB,NumLen);
System.arraycopy(CAMInvB,0,B,0,NumLen);
B0l=(int)B[0];
invB0l=B0l;
invB0l=invB0l*(2-B0l*invB0l);
invB0l=invB0l*(2-B0l*invB0l);
invB0l=invB0l*(2-B0l*invB0l);
invB0l=invB0l*(2-B0l*invB0l);
for(i=NumLen-1;i>=0;i--) CAMGam[i]=CAMInvMu[i]=0;
CAMInvMu[0]=1;
Dif=0;
OLup:for(;;){
Iaa=Ibb=1;Iab=Iba=0;
Al=(int)CAMInvA[0];Bl=(int)CAMInvB[0];
E=0;P=1;
if(Bl==0){
for(i=NumLen-1;i>=0;i--)
if(CAMInvB[i]!=0)
break;
if(i<0)
break;
}
for(;;){
T1=0;
while((Bl&1)==0){
if(E==31){
Yaa=Iaa;Yab=Iab;Yba=Iba;Ybb=Ibb;
Gl=(int)CAMGam[0];Ml=(int)CAMInvMu[0];
Dif++;T1++;Yaa <<= T1;Yab <<= T1;
Ymb0=(-(int)Yaa*Ml-(int)Yab*Gl)*invB0l;Ygb0=(-Iba*Ml-Ibb*Gl)*invB0l;
cry1=cry2=cry3=cry4=0;Yaah=(int)(Yaa>>32);
Yabh=(int)(Yab>>32);Ybah=(int)(Yba>>32);Ybbh=(int)(Ybb>>32);Ymb0h=(int)(Ymb0>>32);
Ygb0h=(int)(Ygb0>>32);Yaa&=ffl;Yab&=ffl;Yba&=ffl;
Ybb&=ffl;Ymb0&=ffl;Ygb0&=ffl;
st1=Yaah*6+Yabh*2+Ymb0h;st2=Ybah*6+Ybbh*2+Ygb0h;
for(i=0;i<NumLen;i++){
Pr1=Yaa*(Tmp1=CAMInvMu[i]);Pr2=Yab*(Tmp2=CAMGam[i]);
Pr3=Ymb0*(Tmp3=B[i]);
Pr4 =(Pr1&ffl)+(Pr2&ffl)+(Pr3&ffl)+cry3;
Pr5=Yaa*(Tmp4=CAMInvA[i]);Pr6=Yab*(Tmp5=CAMInvB[i]);
Pr7=(Pr5&ffl)+(Pr6&ffl)+cry1;
switch(st1){
case -9:
cry3=-Tmp1-Tmp2-Tmp3;cry1=-Tmp4-Tmp5;
break;
case -8:
cry3=-Tmp1-Tmp2;cry1=-Tmp4-Tmp5;
break;
case -7:
cry3=-Tmp1-Tmp3;cry1=-Tmp4;
break;
case -6:
cry3=-Tmp1;cry1=-Tmp4;
break;
case -5:
cry3=-Tmp1+Tmp2-Tmp3;cry1=-Tmp4+Tmp5;
break;
case -4:
cry3=-Tmp1+Tmp2;cry1=-Tmp4+Tmp5;
break;
case -3:
cry3=-Tmp2-Tmp3;cry1=-Tmp5;
break;
case -2:
cry3=-Tmp2;cry1=-Tmp5;
break;
case -1:
cry3=-Tmp3;cry1=0;
break;
case 0:
cry3=cry1=0;
break;
case 1:
cry3=Tmp2-Tmp3;cry1=Tmp5;
break;
case 2:
cry3=Tmp2;cry1=Tmp5;
break;
case 3:
cry3=Tmp1-Tmp2-Tmp3;cry1=Tmp4-Tmp5;
break;
case 4:
cry3=Tmp1-Tmp2;cry1=Tmp4-Tmp5;
break;
case 5:
cry3=Tmp1-Tmp3;cry1=Tmp4;
break;
case 6:
cry3=Tmp1;cry1=Tmp4;
break;
case 7:
cry3=Tmp1+Tmp2-Tmp3;cry1=Tmp4+Tmp5;
break;
case 8:
cry3=Tmp1+Tmp2;cry1=Tmp4+Tmp5;
break;
}
cry3+=(Pr1>>>32)+(Pr2>>>32)+(Pr3>>>32)+(Pr4>>32);
cry1+=(Pr5>>>32)+(Pr6>>>32)+(Pr7>>32);
if(i>0){
CAMInvMu[i-1]=Pr4&ffl;CAMInvA[i-1]=Pr7&ffl;
}
Pr1=Yba*Tmp1;Pr2=Ybb*Tmp2;Pr3=Ygb0*Tmp3;
Pr4 =(Pr1&ffl)+(Pr2&ffl)+(Pr3&ffl)+cry4;
Pr5=Yba*Tmp4;Pr6=Ybb*Tmp5;
Pr7=(Pr5&ffl)+(Pr6&ffl)+cry2;
switch(st2){
case -9:
cry4=-Tmp1-Tmp2-Tmp3;cry2=-Tmp4-Tmp5;
break;
case -8:
cry4=-Tmp1-Tmp2;cry2=-Tmp4-Tmp5;
break;
case -7:
cry4=-Tmp1-Tmp3;cry2=-Tmp4;
break;
case -6:
cry4=-Tmp1;cry2=-Tmp4;
break;
case -5:
cry4=-Tmp1+Tmp2-Tmp3;cry2=-Tmp4+Tmp5;
break;
case -4:
cry4=-Tmp1+Tmp2;cry2=-Tmp4+Tmp5;
break;
case -3:
cry4=-Tmp2-Tmp3;cry2=-Tmp5;
break;
case -2:
cry4=-Tmp2;cry2=-Tmp5;
break;
case -1:
cry4=-Tmp3;cry2=0;
break;
case 0:
cry4=cry2=0;
break;
case 1:
cry4=Tmp2-Tmp3;cry2=Tmp5;
break;
case 2:
cry4=Tmp2;cry2=Tmp5;
break;
case 3:
cry4=Tmp1-Tmp2-Tmp3;cry2=Tmp4-Tmp5;
break;
case 4:
cry4=Tmp1-Tmp2;cry2=Tmp4-Tmp5;
break;
case 5:
cry4=Tmp1-Tmp3;cry2=Tmp4;
break;
case 6:
cry4=Tmp1;cry2=Tmp4;
break;
case 7:
cry4=Tmp1+Tmp2-Tmp3;cry2=Tmp4+Tmp5;
break;
case 8:
cry4=Tmp1+Tmp2;cry2=Tmp4+Tmp5;
break;
}
cry4+=(Pr1>>>32)+(Pr2>>>32)+(Pr3>>>32)+(Pr4>>32);
cry2+=(Pr5>>>32)+(Pr6>>>32)+(Pr7>>32);
if(i>0){
CAMGam[i-1]=Pr4&ffl;CAMInvB[i-1]=Pr7&ffl;
}
}
if((int)CAMInvA[i-1]<0){
cry1-=Yaa;cry2-=Yba;
}
if((int)CAMInvB[i-1]<0){
cry1-=Yab;cry2-=Ybb;
}
if((int)CAMInvMu[i-1]<0){
cry3-=Yaa;cry4-=Yba;
}
if((int)CAMGam[i-1]<0){
cry3-=Yab;cry4-=Ybb;
}
CAMInvA[i-1]=cry1&ffl;CAMInvB[i-1]=cry2&ffl;
CAMInvMu[i-1]=cry3&ffl;CAMGam[i-1]=cry4&ffl;
continue OLup;
}
Bl>>=1;Dif++;E++;P *= 2;T1++;
}
Iaa <<= T1;Iab <<= T1;
if(Dif>=0){
Dif=-Dif;
if(((Al+Bl)&3)==0){
T1=Iba;Iba+=Iaa;Iaa=T1;T1=Ibb;Ibb+=Iab;Iab=T1;T1=Bl;Bl+=Al;Al=T1;
}else{
T1=Iba;Iba-=Iaa;Iaa=T1;T1=Ibb;Ibb-=Iab;Iab=T1;T1=Bl;Bl-=Al;Al=T1;
}
}else{
if(((Al+Bl)&3)==0){
Iba+=Iaa;Ibb+=Iab;Bl+=Al;
}else{
Iba-=Iaa;Ibb-=Iab;Bl-=Al;
}
}
Dif--;
}
}
if(CAMInvA[0]!=1)
MinBNbr32(B,CAMInvMu,CAMInvMu,NumLen);
if((int)CAMInvMu[i=NumLen-1]<0)
plBNbr32(B,CAMInvMu,CAMInvMu,NumLen);
for(;i>=0;i--)
if(B[i]!=CAMInvMu[i])
break;
if(i<0||B[i]<CAMInvMu[i])MinBNbr32(CAMInvMu,B,CAMInvMu,NumLen);
C32To31(CAMInvMu,inv,NumLen);
}
static void getMonP(){
int N,x,i,j,k,div;
int length;
dN=(double) TNbr[NumLen-1];
if(NumLen>1)dN+=(double) TNbr[NumLen-2]/dBit31;
if(NumLen>2)dN+=(double) TNbr[NumLen-3]/dBit62;
x=N=(int)TNbr[0];x=x*(2-N*x);x=x*(2-N*x);x=x*(2-N*x);
x=x*(2-N*x);MonMulN=(-x)&ff8;j=NumLen;MonMul1[j]=1;
do{
MonMul1[--j]=0;
}
while(j>0);
AdjMN(MonMul1,TNbr,NumLen);
MBNbrMN(MonMul1,MonMul1,MonMul2,TNbr,NumLen);
MonMult(MonMul2,MonMul2,MonMulAInv);
PlBNbrMN(MonMul1,MonMul1,MonMul2,TNbr,NumLen);
}
static boolean BNbrEq(int Nbr1[],int Nbr2[]){
for(int i=0;i<NumLen;i++)
if(Nbr1[i]!=Nbr2[i])
return false;
return true;
}
static void LToBNbr(long Nbr,int Out[],int NumLen){
int i;
Out[0]=(int)(Nbr&ff8);Out[1]=(int)((Nbr>>31)&ff8);
for(i=2;i<NumLen;i++)Out[i]=(Nbr<0?ff8:0);
}
static BigInteger fnECM(BigInteger N){
if(System.currentTimeMillis()-TM>Tsup)return one;
int I,J,Pass,Qaux,Prob,i,j,u;
long L1,L2,LS,P,Q,IP,Paux=1;
int[] A0=new int[NL];
int[] A02=new int[NL];
int[] A03=new int[NL];
int[] AA=new int[NL];
int[] DX=new int[NL];
int[] DZ=new int[NL];
int[] GD=new int[NL];
int[] M=new int[NL];
int[] TX=new int[NL];
FTX=TX;
int[] TZ=new int[NL];
FTZ=TZ;
int[] UX=new int[NL];
FUX=UX;
int[] UZ=new int[NL];
FUZ=UZ;
int[] W1=new int[NL];
int[] W2=new int[NL];
int[] W3=new int[NL];
int[] W4=new int[NL];
int[] WX=new int[NL];
int[] WZ=new int[NL];
int[] X=new int[NL];
int[] Z=new int[NL];
int[] Aux1=new int[NL];
fAux1=Aux1;
int[] Aux2=new int[NL];
fAux2=Aux2;
int[] Aux3=new int[NL];
fAux3=Aux3;
int[] Aux4=new int[NL];
fAux4=Aux4;
int[] Xaux=new int[NL];
int[] Zaux=new int[NL];
int[][] root=new int[480][NL];
byte[] sv=new byte[23100];
byte[] sv2310=new byte[2310];
int[] svidx=new int[480];
BigInteger NN;
FAA=AA;
NumLen=NbrToInt(N,TNbr);
BigNbr1[0]=1;
for(i=1;i<NL;i++)BigNbr1[i]=0;
GetYFreq();getMonP();
for(I=0;I<NumLen;I++)M[I]=DX[I]=DZ[I]=W3[I]=W4[I]=GD[I]=0;
EC--;
SP[0]=2;
P=3;idM=1;
for(idM=1;idM<SP.length;idM++){
SP[idM]=(int)P;
calnp:for(;;){
P+=2;
for(Q=3;Q*Q<=P;Q+=2)
if(P%Q==0)continue calnp;
break;
}
}int l=5;
do{
n_c:for(int ll=0;ll<5;ll++){
if(System.currentTimeMillis()-TM>Tsup)return one;
EC++;
L1=N.toString().length();
if(L1>30&&L1<=90){     
int limit=LIM[((int)L1-31)/5];
if(EC%50000000>=limit){    
EC+=END;
return one;
}
}
L1=2000;L2=200000;
LS=45;Paux=EC;nbrprm=303;
if(EC>25){
if(EC<326){
L1=50000;
L2=5000000;
LS=224;
Paux=EC-24;
nbrprm=5133;
}else{
if(EC<2000){
L1=1000000;L2=100000000;LS=1001;Paux=EC-299;nbrprm=78498;
}else{
L1=11000000;L2=1100000000;LS=3316;Paux=EC-1900;nbrprm=726517;
}
}
}
LToBNbr(2*(EC+1),Aux1,NumLen);
LToBNbr(3*(EC+1)*(EC+1)-1,Aux2,NumLen);
MIBNbr(Aux2,Aux2,TNbr,NumLen);
MBNbrMN(Aux1,Aux2,Aux3,TNbr,NumLen);
MBNbrMN(Aux3,MonMul1,A0,TNbr,NumLen);
MonMult(A0,A0,A02);
MonMult(A02,A0,A03);
MinBNbrModN(A03,A0,Aux1,TNbr,NumLen);
MulBNbrLMN(A02,9,Aux2,TNbr,NumLen);
MinBNbrModN(Aux2,MonMul1,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,Aux3);
if(BIsZero(Aux3))continue;
MulBNbrLMN(A0,4,Z,TNbr,NumLen);
MulBNbrLMN(A02,6,Aux1,TNbr,NumLen);
MinBNbrModN(MonMul1,Aux1,Aux1,TNbr,NumLen);
MonMult(A02,A02,Aux2);
MulBNbrLMN(Aux2,3,Aux2,TNbr,NumLen);
MinBNbrModN(Aux1,Aux2,Aux1,TNbr,NumLen);
MulBNbrLMN(A03,4,Aux2,TNbr,NumLen);
MIBNbr(Aux2,Aux2,TNbr,NumLen);
MonMult(Aux2,MonMulAInv,Aux3);
MonMult(Aux1,Aux3,A0);
PlBNbrMN(A0,MonMul2,Aux1,TNbr,NumLen);
LToBNbr(4,Aux2,NumLen);
MIBNbr(Aux2,Aux3,TNbr,NumLen);
MBNbrMN(Aux3,MonMul1,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,AA);
MulBNbrLMN(A02,3,Aux1,TNbr,NumLen);
PlBNbrMN(Aux1,MonMul1,X,TNbr,NumLen);
System.arraycopy(X,0,Xaux,0,NumLen);
System.arraycopy(Z,0,Zaux,0,NumLen);
System.arraycopy(MonMul1,0,GCDACC,0,NumLen);
for(Pass=0;Pass<2;Pass++){
idprm=0;stECM=1;
for(I=1;I<=L1;I <<= 1)Dup(X,Z,X,Z);
for(I=3;I<=L1;I *= 3){
Dup(W1,W2,X,Z);add3(X,Z,X,Z,W1,W2,X,Z);
}
if(Pass==0){
MonMult(GCDACC,Z,Aux1);
System.arraycopy(Aux1,0,GCDACC,0,NumLen);
}else{
GcdBN(Z,TNbr,GD,NumLen);
if(!BNbrEq(GD,BigNbr1))break n_c;
}
idM=1;
do{
idprm++;P=SP[idM];
for(IP=P;IP<=L1;IP *= P)prac((int)P,X,Z,W1,W2,W3,W4);
idM++;
if(Pass==0){
MonMult(GCDACC,Z,Aux1);
System.arraycopy(Aux1,0,GCDACC,0,NumLen);
}else{
GcdBN(Z,TNbr,GD,NumLen);
if(!BNbrEq(GD,BigNbr1))break n_c;
}
}while(SP[idM-1]<=LS);
P+=2;u=(int)P;
for(i=0;i<2310;i++){
sv2310[i] =(u%3==0||u%5==0||u%7==0||u%11==0?(byte)1:(byte)0);
u+=2;
}
do{
GENsv((int)P,sv,sv2310,SP);
for(i=0;i<23100;i++){
if(sv[i]!=0)continue;
if(P+2*i>L1)break;
idprm++;
prac((int)(P+2*i),X,Z,W1,W2,W3,W4);
if(Pass==0){
MonMult(GCDACC,Z,Aux1);
System.arraycopy(Aux1,0,GCDACC,0,NumLen);
}else{
GcdBN(Z,TNbr,GD,NumLen);	
if(!BNbrEq(GD,BigNbr1))break n_c;
}
}
P+=46200;
}while(P<L1);
if(Pass==0){
if(BIsZero(GCDACC)){
System.arraycopy(Xaux,0,X,0,NumLen);
System.arraycopy(Zaux,0,Z,0,NumLen);
continue;
}
GcdBN(GCDACC,TNbr,GD,NumLen);
if(!BNbrEq(GD,BigNbr1))break n_c;
break;
}
}
stECM=2;j=0;
for(u=1;u<2310;u+=2)
if(u%3==0||u%5==0||u%7==0||u%11==0)sv2310[u/2]=(byte)1;
else sv2310[(svidx[j++]=u/2)]=(byte)0;
System.arraycopy(sv2310,0,sv2310,1155,1155);
System.arraycopy(X,0,Xaux,0,NumLen);
System.arraycopy(Z,0,Zaux,0,NumLen);
for(Pass=0;Pass<2;Pass++){
System.arraycopy(MonMul1,0,GCDACC,0,NumLen);
System.arraycopy(X,0,UX,0,NumLen);
System.arraycopy(Z,0,UZ,0,NumLen);
MIBNbr(Z,Aux2,TNbr,NumLen);
MonMult(Aux2,MonMulAInv,Aux1);
MonMult(Aux1,X,root[0]);J=0;
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W1);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W2);
MonMult(W1,W2,TX);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,AA,Aux2);
PlBNbrMN(Aux2,W2,Aux3,TNbr,NumLen);
MonMult(Aux1,Aux3,TZ);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
PlBNbrMN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W1);
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MinBNbrModN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W2);
PlBNbrMN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UZ,X);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UX,Z);
for(I=5;I<2310;I+=2){
System.arraycopy(X,0,WX,0,NumLen);
System.arraycopy(Z,0,WZ,0,NumLen);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
PlBNbrMN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W1);
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MinBNbrModN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W2);
PlBNbrMN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UZ,X);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UX,Z);
if(Pass==0){
MonMult(GCDACC,Aux1,Aux2);
System.arraycopy(Aux2,0,GCDACC,0,NumLen);
}else{
GcdBN(Aux1,TNbr,GD,NumLen);
if(!BNbrEq(GD,BigNbr1))break n_c;				 
}
if(I==1155){
System.arraycopy(X,0,DX,0,NumLen);
System.arraycopy(Z,0,DZ,0,NumLen);
}
if(I%3!=0&&I%5!=0&&I%7!=0&&I%11!=0){
J++;
MIBNbr(Z,Aux2,TNbr,NumLen);
MonMult(Aux2,MonMulAInv,Aux1);
MonMult(Aux1,X,root[J]);
}
System.arraycopy(WX,0,UX,0,NumLen);
System.arraycopy(WZ,0,UZ,0,NumLen);
}
PlBNbrMN(DX,DZ,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W1);
MinBNbrModN(DX,DZ,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W2);
MonMult(W1,W2,X);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,AA,Aux2);
PlBNbrMN(Aux2,W2,Aux3,TNbr,NumLen);
MonMult(Aux1,Aux3,Z);
System.arraycopy(X,0,UX,0,NumLen);
System.arraycopy(Z,0,UZ,0,NumLen);
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W1);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,W2);
MonMult(W1,W2,TX);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,AA,Aux2);
PlBNbrMN(Aux2,W2,Aux3,TNbr,NumLen);
MonMult(Aux1,Aux3,TZ);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
PlBNbrMN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W1);
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MinBNbrModN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W2);
PlBNbrMN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UZ,X);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UX,Z);
Qaux=(int)(L1/4620);
mIdM=(int)(L2/4620);
for(idM=0;idM<=mIdM;idM++){
if(idM>=Qaux){
if(idM==0){
MIBNbr(UZ,Aux2,TNbr,NumLen);
MonMult(Aux2,MonMulAInv,Aux3);
MonMult(UX,Aux3,Aux1);
}else{
MIBNbr(Z,Aux2,TNbr,NumLen);
MonMult(Aux2,MonMulAInv,Aux3);
MonMult(X,Aux3,Aux1);
}
if(idM%10==0||idM==Qaux) GENsv(idM/10*46200+1,sv,sv2310,SP);
J=1155+(idM%10)*2310;
for(i=0;i<480;i++){
j=svidx[i];
if(sv[J+j]!=0&&sv[J-1-j]!=0)continue;
MinBNbrModN(Aux1,root[i],M,TNbr,NumLen);
MonMult(GCDACC,M,Aux2);
System.arraycopy(Aux2,0,GCDACC,0,NumLen);
}
if(Pass!=0){
GcdBN(GCDACC,TNbr,GD,NumLen);
if(!BNbrEq(GD,BigNbr1))continue;
}
}
if(idM!=0){
System.arraycopy(X,0,WX,0,NumLen);
System.arraycopy(Z,0,WZ,0,NumLen);
MinBNbrModN(X,Z,Aux1,TNbr,NumLen);
PlBNbrMN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W1);
PlBNbrMN(X,Z,Aux1,TNbr,NumLen);
MinBNbrModN(TX,TZ,Aux2,TNbr,NumLen);
MonMult(Aux1,Aux2,W2);
PlBNbrMN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UZ,X);
MinBNbrModN(W1,W2,Aux1,TNbr,NumLen);
MonMult(Aux1,Aux1,Aux2);
MonMult(Aux2,UX,Z);
System.arraycopy(WX,0,UX,0,NumLen);
System.arraycopy(WZ,0,UZ,0,NumLen);
}
}
if(Pass==0){
if(BIsZero(GCDACC)){
System.arraycopy(Xaux,0,X,0,NumLen);
System.arraycopy(Zaux,0,Z,0,NumLen);
continue;
}
GcdBN(GCDACC,TNbr,GD,NumLen);
if(BNbrEq(GD,TNbr))break;
if(!BNbrEq(GD,BigNbr1))continue;
break;
}
}
}
}while(BNbrEq(GD,TNbr)&&l++<10);
stECM=0;
return IntToNbr(GD,NumLen);
}
static void C32To31(long[] nbr32bits,int[] nbr31bits,int NumLen){
int i,j,k;
j=0;
nbr32bits[NumLen]=0;
for(i=0;i<NumLen;i++){
k=i&0x0000001F;
if(k==0) nbr31bits[i]=(int)(nbr32bits[j]&ff8);
else{
nbr31bits[i]=(int)(((nbr32bits[j]>>(32-k)) |(nbr32bits[j+1]<<k))&ff8);
j++;
}
}
}
static void MonMult2(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig;
long Prod0,Prod1;
Prod0=Prod1=0;long TNbr0=TNbr[0];
long TNbr1=TNbr[1];long Nbr2_0=Nbr2[0];
long Nbr2_1=Nbr2[1];
for(int i=0;i<2;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=Pr>>>31;
}
if(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0)){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=((Pr>>31)+Prod1-TNbr1)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;
}

static void MonMult3(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2;
Prod0=Prod1=Prod2=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2];
for(int i=0;i<3;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=Pr>>>31;
}
if(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=((Pr>>31)+Prod2-TNbr2)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;
}
static void MonMult4(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2];
Prod0=Prod1=Prod2=Prod3=0;
long TNbr3=TNbr[3],Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3];
for(int i=0;i<4;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=Pr>>>31;
}
if(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0)))) {
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=((Pr>>31)+Prod3-TNbr3)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;
}

static void MonMult5(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,Prod4;
Prod0=Prod1=Prod2=Prod3=Prod4=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3],TNbr4=TNbr[4];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4];
for(int i=0;i<5;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=Pr>>>31;
}
if(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0))))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=(Pr=(Pr>>31)+Prod3-TNbr3)&fff;
Prod4=((Pr>>31)+Prod4-TNbr4)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;
}

static void MonMult6(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,Prod4,Prod5;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3],TNbr4=TNbr[4],TNbr5=TNbr[5],Nbr2_0=Nbr2[0];
long Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4],Nbr2_5=Nbr2[5];
for(int i=0;i<6;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=Pr>>>31;
}
if(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0)))))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=(Pr=(Pr>>31)+Prod3-TNbr3)&fff;
Prod4=(Pr=(Pr>>31)+Prod4-TNbr4)&fff;
Prod5=((Pr>>31)+Prod5-TNbr5)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;Prod[5]=(int)Prod5;
}

static void MonMult7(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr;
int MontDig,Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=Prod6=0;
int TNbr0=(int)TNbr[0],TNbr1=(int)TNbr[1],TNbr2=(int)TNbr[2],TNbr3=(int)TNbr[3],TNbr4=(int)TNbr[4],TNbr5=(int)TNbr[5],TNbr6=(int)TNbr[6];
int Nbr2_0=(int)Nbr2[0],Nbr2_1=(int)Nbr2[1],Nbr2_2=(int)Nbr2[2],Nbr2_3=(int)Nbr2[3],Nbr2_4=(int)Nbr2[4],Nbr2_5=(int)Nbr2[5],Nbr2_6=(int)Nbr2[6];
int Sum;
for(int i=0;i<7;i++){
Pr=(Nbr=Nbr1[i])*(long)Nbr2_0+Prod0;
MontDig=((int)Pr*(int)MonMulN)&ff8;
Prod0=(int)(Pr=((MontDig*(long)TNbr0+Pr)>>>31)+MontDig*(long)TNbr1+Nbr*(long)Nbr2_1+Prod1)&ff8;
Prod1=(int)(Pr=(Pr>>>31)+MontDig*(long)TNbr2+Nbr*(long)Nbr2_2+Prod2)&ff8;
Prod2=(int)(Pr=(Pr>>>31)+MontDig*(long)TNbr3+Nbr*(long)Nbr2_3+Prod3)&ff8;
Prod3=(int)(Pr=(Pr>>>31)+MontDig*(long)TNbr4+Nbr*(long)Nbr2_4+Prod4)&ff8;
Prod4=(int)(Pr=(Pr>>>31)+MontDig*(long)TNbr5+Nbr*(long)Nbr2_5+Prod5)&ff8;
Prod5=(int)(Pr=(Pr>>>31)+MontDig*(long)TNbr6+Nbr*(long)Nbr2_6+Prod6)&ff8;
Prod6=(int)(Pr>>>31);
}
if(Prod6>TNbr6||Prod6==TNbr6&&(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0))))))){
Prod0=(Sum=Prod0-TNbr0)&ff8;
Prod1=(Sum=(Sum>>31)+(Prod1-TNbr1))&ff8;
Prod2=(Sum=(Sum>>31)+(Prod2-TNbr2))&ff8;
Prod3=(Sum=(Sum>>31)+(Prod3-TNbr3))&ff8;
Prod4=(Sum=(Sum>>31)+(Prod4-TNbr4))&ff8;
Prod5=(Sum=(Sum>>31)+(Prod5-TNbr5))&ff8;
Prod6=((Sum>>31)+(Prod6-TNbr6))&ff8;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;
}
static void MonMult8(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6,Prod7;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=Prod6=Prod7=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3];
long TNbr4=TNbr[4],TNbr5=TNbr[5],TNbr6=TNbr[6],TNbr7=TNbr[7];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4],Nbr2_5=Nbr2[5];
long Nbr2_6=Nbr2[6],Nbr2_7=Nbr2[7];
for(int i=0;i<8;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=(Pr=(Pr>>>31)+MontDig*TNbr6+Nbr*Nbr2_6+Prod6)&fff;
Prod6=(Pr=(Pr>>>31)+MontDig*TNbr7+Nbr*Nbr2_7+Prod7)&fff;
Prod7=Pr>>>31;
}
if(Prod7>TNbr7||Prod7==TNbr7&&(Prod6>TNbr6||Prod6==TNbr6&&(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0)))))))){
Prod[0]=(int)((Pr=Prod0-TNbr0)&fff);
Prod[1]=(int)((Pr=(Pr>>31)+Prod1-TNbr1)&fff);
Prod[2]=(int)((Pr=(Pr>>31)+Prod2-TNbr2)&fff);
Prod[3]=(int)((Pr=(Pr>>31)+Prod3-TNbr3)&fff);
Prod[4]=(int)((Pr=(Pr>>31)+Prod4-TNbr4)&fff);
Prod[5]=(int)((Pr=(Pr>>31)+Prod5-TNbr5)&fff);
Prod[6]=(int)((Pr=(Pr>>31)+Prod6-TNbr6)&fff);
Prod[7]=(int)(((Pr>>31)+Prod7-TNbr7)&fff);
return;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;
Prod[4]=(int)Prod4;Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;Prod[7]=(int)Prod7;
}

static void MonMult9(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6,Prod7,Prod8;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=Prod6=Prod7=Prod8=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3];
long TNbr4=TNbr[4],TNbr5=TNbr[5],TNbr6=TNbr[6],TNbr7=TNbr[7],TNbr8=TNbr[8];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4];
long Nbr2_5=Nbr2[5],Nbr2_6=Nbr2[6],Nbr2_7=Nbr2[7],Nbr2_8=Nbr2[8];
for(int i=0;i<9;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=(Pr=(Pr>>>31)+MontDig*TNbr6+Nbr*Nbr2_6+Prod6)&fff;
Prod6=(Pr=(Pr>>>31)+MontDig*TNbr7+Nbr*Nbr2_7+Prod7)&fff;
Prod7=(Pr=(Pr>>>31)+MontDig*TNbr8+Nbr*Nbr2_8+Prod8)&fff;
Prod8=Pr>>>31;
}
if(Prod8>TNbr8||Prod8==TNbr8&&(Prod7>TNbr7||Prod7==TNbr7&&(Prod6>TNbr6||Prod6==TNbr6&&(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0))))))))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=(Pr=(Pr>>31)+Prod3-TNbr3)&fff;
Prod4=(Pr=(Pr>>31)+Prod4-TNbr4)&fff;
Prod5=(Pr=(Pr>>31)+Prod5-TNbr5)&fff;
Prod6=(Pr=(Pr>>31)+Prod6-TNbr6)&fff;
Prod7=(Pr=(Pr>>31)+Prod7-TNbr7)&fff;
Prod8=((Pr>>31)+Prod8-TNbr8)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;
Prod[4]=(int)Prod4;Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;Prod[7]=(int)Prod7;Prod[8]=(int)Prod8;
}

static void MonMult10(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig,Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6,Prod7,Prod8,Prod9;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=Prod6=Prod7=Prod8=Prod9=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3],TNbr4=TNbr[4];
long TNbr5=TNbr[5],TNbr6=TNbr[6],TNbr7=TNbr[7],TNbr8=TNbr[8],TNbr9=TNbr[9];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4];
long Nbr2_5=Nbr2[5],Nbr2_6=Nbr2[6],Nbr2_7=Nbr2[7],Nbr2_8=Nbr2[8],Nbr2_9=Nbr2[9];
for(int i=0;i<10;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=(Pr=(Pr>>>31)+MontDig*TNbr6+Nbr*Nbr2_6+Prod6)&fff;
Prod6=(Pr=(Pr>>>31)+MontDig*TNbr7+Nbr*Nbr2_7+Prod7)&fff;
Prod7=(Pr=(Pr>>>31)+MontDig*TNbr8+Nbr*Nbr2_8+Prod8)&fff;
Prod8=(Pr=(Pr>>>31)+MontDig*TNbr9+Nbr*Nbr2_9+Prod9)&fff;
Prod9=Pr>>>31;
}
if(Prod9>TNbr9||Prod9==TNbr9&&(Prod8>TNbr8||Prod8==TNbr8&&(Prod7>TNbr7||Prod7==TNbr7&&(Prod6>TNbr6||Prod6==TNbr6&&(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0)))))))))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=(Pr=(Pr>>31)+Prod3-TNbr3)&fff;
Prod4=(Pr=(Pr>>31)+Prod4-TNbr4)&fff;
Prod5=(Pr=(Pr>>31)+Prod5-TNbr5)&fff;
Prod6=(Pr=(Pr>>31)+Prod6-TNbr6)&fff;
Prod7=(Pr=(Pr>>31)+Prod7-TNbr7)&fff;
Prod8=(Pr=(Pr>>31)+Prod8-TNbr8)&fff;
Prod9=((Pr>>31)+Prod9-TNbr9)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;
Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;Prod[7]=(int)Prod7;Prod[8]=(int)Prod8;Prod[9]=(int)Prod9;
}

static void MonMult11(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig;
long Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6,Prod7,Prod8,Prod9,Prod10;
Prod0=Prod1=Prod2=Prod3 =Prod4=Prod5=Prod6=Prod7=Prod8=Prod9=Prod10=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3],TNbr4=TNbr[4],TNbr5=TNbr[5];
long TNbr6=TNbr[6],TNbr7=TNbr[7],TNbr8=TNbr[8],TNbr9=TNbr[9],TNbr10=TNbr[10];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4],Nbr2_5=Nbr2[5];
long Nbr2_6=Nbr2[6],Nbr2_7=Nbr2[7],Nbr2_8=Nbr2[8],Nbr2_9=Nbr2[9],Nbr2_10=Nbr2[10];
for(int i=0;i<11;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=(Pr=(Pr>>>31)+MontDig*TNbr6+Nbr*Nbr2_6+Prod6)&fff;
Prod6=(Pr=(Pr>>>31)+MontDig*TNbr7+Nbr*Nbr2_7+Prod7)&fff;
Prod7=(Pr=(Pr>>>31)+MontDig*TNbr8+Nbr*Nbr2_8+Prod8)&fff;
Prod8=(Pr=(Pr>>>31)+MontDig*TNbr9+Nbr*Nbr2_9+Prod9)&fff;
Prod9=(Pr=(Pr>>>31)+MontDig*TNbr10+Nbr*Nbr2_10+Prod10)&fff;
Prod10=Pr>>>31;
}
if(Prod10>TNbr10||Prod10==TNbr10&&(Prod9>TNbr9||Prod9==TNbr9&&(Prod8>TNbr8||Prod8==TNbr8&&(Prod7>TNbr7||Prod7==TNbr7&&(Prod6>TNbr6||Prod6==TNbr6&&(Prod5>TNbr5||Prod5==TNbr5&&(Prod4>TNbr4||Prod4==TNbr4&&(Prod3>TNbr3||Prod3==TNbr3&&(Prod2>TNbr2||Prod2==TNbr2&&(Prod1>TNbr1||Prod1==TNbr1&&(Prod0>=TNbr0))))))))))){
Prod0=(Pr=Prod0-TNbr0)&fff;
Prod1=(Pr=(Pr>>31)+Prod1-TNbr1)&fff;
Prod2=(Pr=(Pr>>31)+Prod2-TNbr2)&fff;
Prod3=(Pr=(Pr>>31)+Prod3-TNbr3)&fff;
Prod4=(Pr=(Pr>>31)+Prod4-TNbr4)&fff;
Prod5=(Pr=(Pr>>31)+Prod5-TNbr5)&fff;
Prod6=(Pr=(Pr>>31)+Prod6-TNbr6)&fff;
Prod7=(Pr=(Pr>>31)+Prod7-TNbr7)&fff;
Prod8=(Pr=(Pr>>31)+Prod8-TNbr8)&fff;
Prod9=(Pr=(Pr>>31)+Prod9-TNbr9)&fff;
Prod10=((Pr>>31)+Prod10-TNbr10)&fff;
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;
Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;Prod[7]=(int)Prod7;Prod[8]=(int)Prod8;Prod[9]=(int)Prod9;Prod[10]=(int)Prod10;
} 
static void LMonMult(int Nbr1[],int Nbr2[],int Prod[]){
long Pr,Nbr,MontDig;
long Prod0,Prod1,Prod2,Prod3,Prod4,Prod5,Prod6,Prod7,Prod8,Prod9,Prod10;
Prod0=Prod1=Prod2=Prod3=Prod4=Prod5=Prod6=Prod7=Prod8=Prod9=Prod10=0;
long TNbr0=TNbr[0],TNbr1=TNbr[1],TNbr2=TNbr[2],TNbr3=TNbr[3],TNbr4=TNbr[4],TNbr5=TNbr[5];
long TNbr6=TNbr[6],TNbr7=TNbr[7],TNbr8=TNbr[8],TNbr9=TNbr[9],TNbr10=TNbr[10];
long Nbr2_0=Nbr2[0],Nbr2_1=Nbr2[1],Nbr2_2=Nbr2[2],Nbr2_3=Nbr2[3],Nbr2_4=Nbr2[4],Nbr2_5=Nbr2[5];
long Nbr2_6=Nbr2[6],Nbr2_7=Nbr2[7],Nbr2_8=Nbr2[8],Nbr2_9=Nbr2[9],Nbr2_10=Nbr2[10];
int j;
for(j=11;j<NumLen;j++)Prod[j]=0;
for(int i=0;i<NumLen;i++){
Pr=(Nbr=Nbr1[i])*Nbr2_0+Prod0;
MontDig=((int)Pr*MonMulN)&fff;
Prod0=(Pr=((MontDig*TNbr0+Pr)>>>31)+MontDig*TNbr1+Nbr*Nbr2_1+Prod1)&fff;
Prod1=(Pr=(Pr>>>31)+MontDig*TNbr2+Nbr*Nbr2_2+Prod2)&fff;
Prod2=(Pr=(Pr>>>31)+MontDig*TNbr3+Nbr*Nbr2_3+Prod3)&fff;
Prod3=(Pr=(Pr>>>31)+MontDig*TNbr4+Nbr*Nbr2_4+Prod4)&fff;
Prod4=(Pr=(Pr>>>31)+MontDig*TNbr5+Nbr*Nbr2_5+Prod5)&fff;
Prod5=(Pr=(Pr>>>31)+MontDig*TNbr6+Nbr*Nbr2_6+Prod6)&fff;
Prod6=(Pr=(Pr>>>31)+MontDig*TNbr7+Nbr*Nbr2_7+Prod7)&fff;
Prod7=(Pr=(Pr>>>31)+MontDig*TNbr8+Nbr*Nbr2_8+Prod8)&fff;
Prod8=(Pr=(Pr>>>31)+MontDig*TNbr9+Nbr*Nbr2_9+Prod9)&fff;
Prod9=(Pr=(Pr>>>31)+MontDig*TNbr10+Nbr*Nbr2_10+Prod10)&fff;
Prod10=(Pr=(Pr>>>31)+MontDig*TNbr[11]+Nbr*Nbr2[11]+Prod[11])&fff;
for(j=12;j<NumLen;j++) Prod[j-1]=(int)((Pr=(Pr>>>31)+MontDig*TNbr[j]+Nbr*Nbr2[j]+Prod[j])&fff);
Prod[j-1]=(int)(Pr>>>31);
}
Prod[0]=(int)Prod0;Prod[1]=(int)Prod1;Prod[2]=(int)Prod2;Prod[3]=(int)Prod3;Prod[4]=(int)Prod4;
Prod[5]=(int)Prod5;Prod[6]=(int)Prod6;Prod[7]=(int)Prod7;Prod[8]=(int)Prod8;Prod[9]=(int)Prod9;Prod[10]=(int)Prod10;
for(j=NumLen-1;j>=0;j--)if(Prod[j]!=TNbr[j])break;
if(j<0||j>=0&&Prod[j]>=TNbr[j]){
Pr=0;
for(j=0;j<NumLen;j++) Prod[j]=(int)((Pr=(Pr>>31)+(long)Prod[j]-(long)TNbr[j])&fff);
}
}

static void karatMM(int Nbr1[],int Nbr2[],int Prod[]) {
int cry=0,i;
for(i=0;i<karaLen;i++){
aNbr[i]=Nbr1[i];aNbr[karaLen+i]=(int)Nbr2[i];
}
karaMp(0,karaLen,2*karaLen);
System.arraycopy(aNbr,0,aNbrM,0,2*karaLen);
System.arraycopy(monkara,0,aNbr,0,karaLen);
karaMp(0,karaLen,2*karaLen);
System.arraycopy(aNbr,0,aNbr,0,karaLen);
System.arraycopy(KaraTNbr,0,aNbr,0,karaLen);
karaMp(0,karaLen,2*karaLen);
for(i=0;i<2*karaLen;i++){
cry+=aNbr[i]+aNbrM[i];
if(cry<0){
aNbr[i]=cry-(-0x80000000);
cry=1;
} else{
aNbr[i]=cry;
cry=0;
}
}
if(cry==0){
for(i=2*karaLen-1;i>=karaLen;i--){
if(aNbr[i]>KaraTNbr[i]){
cry=1;
break;
}
if(aNbr[i]<KaraTNbr[i]) break;
}
}
if(cry!=0){
cry=0;
for(i=2*karaLen-1;i>=karaLen;i--){
cry+=aNbr[i]-KaraTNbr[i];
if(cry<0) aNbr[i]=cry-(-0x80000000);
else aNbr[i]=cry;
}
}
for(i=karaLen;i<2*karaLen;i++) Prod[i-karaLen]=aNbr[i];

}
static void C31To32(int[] nbr31bits,long[] nbr32bits,int NumLen){
int i=0,j,k;
for(j=-1;j<NumLen;j++){
k=i%31;
if(k==0)j++;
if(j==NumLen) break;
if(j==NumLen-1) nbr32bits[i]=nbr31bits[j]>>k;
else nbr32bits[i]=((nbr31bits[j]>>k) |(nbr31bits[j+1]<<(31-k)))&ffl;
i++;
}
for(;i<NumLen;i++) nbr32bits[i]=0;
}
static void MinBNbr32(long Nbr1[],long Nbr2[],long Diff[],int NumLen){
long cry=0;
for(int i=0;i<NumLen;i++){
cry=(cry>>32)+Nbr1[i]-Nbr2[i];
Diff[i]=cry&ffl;
}
}
static void plBNbr32(long Nbr1[],long Nbr2[],long Sum[],int NumLen){
long cry=0;
for(int i=0;i<NumLen;i++){
cry=(cry>>32)+Nbr1[i]+Nbr2[i];
Sum[i]=cry&ffl;
}
}
static void MoMp(int idFa1,int length){
long sum=0,cry,prod;
int Did,j,offs,tmp,idFa2=idFa1+length;
int Lid=2*length-1;
for(Did=0;Did<Lid;Did++){
cry=0;
offs=idFa2+Did;
if(Did<length){
for(j=Did;j>0;j-=2){
prod=(long)aNbr[idFa1+j]*(long)aNbr[offs-j]+(long)aNbr[idFa1+j-1]*(long)aNbr[offs-j+1];
sum+=prod&fff;
cry+=prod>>>31;
}
if(j==0){
prod=(long)aNbr[idFa1+j]*(long)aNbr[offs-j];
sum+=prod&fff;
cry+=prod>>>31;
}
}else{
for(j=length-1;j>Did-length;j-=2){
prod=(long)aNbr[idFa1+j]*(long)aNbr[offs-j] +(long)aNbr[idFa1+j-1]*(long)aNbr[offs-j+1];
sum+=prod&fff;cry+=prod>>>31;
}
if(j==Did-length){
prod=(long)aNbr[idFa1+j]*(long)aNbr[offs-j];
sum+=prod&fff;cry+=prod>>>31;
}
}
tmp=(int)(sum>>>31);aNbrAux[Did]=(int)sum&ff8;sum=cry+tmp;
}
aNbrAux[Did]=(int)sum;
System.arraycopy(aNbrAux,0,aNbr,idFa1,2*length);
}
static void AdjMN(int Nbr[],int TNbr[],int NumLen){
long MUint=fff,Triquo,cry;
int i;
double dAux,dN;
dN=(double) TNbr[NumLen-1];
if(NumLen>1)dN+=(double) TNbr[NumLen-2]/dBit31;
if(NumLen>2)dN+=(double) TNbr[NumLen-3]/dBit62;
dAux =(double) Nbr[NumLen]*dBit31+(double) Nbr[NumLen-1];
if(NumLen>1) dAux+=(double) Nbr[NumLen-2]/dBit31;
Triquo=(long)(dAux/dN)+3;
if(Triquo>=Bit32) {
cry=0;
for(i=0;i<NumLen;i++){
cry=Nbr[i+1]-(Triquo>>>31)*TNbr[i]-cry;
Nbr[i+1]=(int)(cry&MUint);cry=(MUint-cry)>>>31;
}
Triquo&=MUint;
}
cry=0;
for(i=0;i<NumLen;i++){
cry=Nbr[i]-Triquo*TNbr[i]-cry;
Nbr[i]=(int)(cry&MUint);cry=(MUint-cry)>>>31;
}
Nbr[NumLen]-=(int)cry;
while((Nbr[NumLen]&MUint)!=0){
cry=0;
for(i=0;i<NumLen;i++) {
cry+=(long)Nbr[i]+(long)TNbr[i];Nbr[i]=(int)(cry&MUint);cry>>=31;
}
Nbr[NumLen]+=(int)cry;
}
}
static void MBNbrMN(int Nbr1[],int Nbr2[],int Prod[],int TNbr[],int NumLen){
long MUint=fff,Pr,Nbr;
int i,j;
if(NumLen>=2&&TNbr[NumLen-1]==0&&TNbr[NumLen-2]<0x40000000) NumLen--;
i=NumLen;
do{
Prod[--i]=0;
}while(i>0);
i=NumLen;
do{
Nbr=Nbr1[--i];j=NumLen;
do{
Prod[j]=Prod[j-1];j--;
}while(j>0);
Prod[0]=0;Pr=0;
for(j=0;j<NumLen;j++){
Pr=(Pr>>>31)+Nbr*Nbr2[j]+Prod[j];Prod[j]=(int)(Pr&MUint);
}
Prod[j]+=(Pr>>>31);AdjMN(Prod,TNbr,NumLen);
}while(i>0);
}
static void PlBNbrMN(int Nbr1[],int Nbr2[],int Sum[],int TNbr[],int NumLen){
long MUint=fff,cry=0;
int i;
for(i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Nbr1[i]+(long)Nbr2[i]-(long)TNbr[i];Sum[i]=(int)(cry&MUint);
}
if(cry<0){
cry=0;
for(i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Sum[i]+(long)TNbr[i];Sum[i]=(int)(cry&MUint);
}
}
}
static void MulBNbrLMN(int Nbr1[],long Nbr2,int Prod[],int TNbr[],int NumLen){
long MUint=fff,Pr;
int j;

if(NumLen>=2&&TNbr[NumLen-1]==0&&TNbr[NumLen-2]<0x40000000)NumLen--;
Pr=0;
for(j=0;j<NumLen;j++){
Pr=(Pr>>>31)+Nbr2*Nbr1[j];Prod[j]=(int)(Pr&MUint);
}
Prod[j]=(int)(Pr>>>31);AdjMN(Prod,TNbr,NumLen);
}
static void add3(int[] x3,int[] z3,int[] x2,int[] z2,int[] x1,int[] z1,int[] x,int[] z){
int[] t=FTX;int[] u=FTZ;int[] v=FUX;int[] w=FUZ;
MinBNbrModN(x2,z2,v,TNbr,NumLen);
PlBNbrMN(x1,z1,w,TNbr,NumLen);MonMult(v,w,u);
PlBNbrMN(x2,z2,w,TNbr,NumLen);
MinBNbrModN(x1,z1,t,TNbr,NumLen);MonMult(t,w,v);
PlBNbrMN(u,v,t,TNbr,NumLen);MonMult(t,t,w);
MinBNbrModN(u,v,t,TNbr,NumLen);MonMult(t,t,v);
if(BNbrEq(x,x3)){
System.arraycopy(x,0,u,0,NumLen);System.arraycopy(w,0,t,0,NumLen);
MonMult(z,t,w);MonMult(v,u,z3);
System.arraycopy(w,0,x3,0,NumLen);
}else{
MonMult(w,z,x3);MonMult(x,v,z3);
}
}
static void Dup(int[] x2,int[] z2,int[] x1,int[] z1){
int[] u=FUZ;int[] v=FTX;int[] w=FTZ;
PlBNbrMN(x1,z1,w,TNbr,NumLen);MonMult(w,w,u);
MinBNbrModN(x1,z1,w,TNbr,NumLen);MonMult(w,w,v);
MonMult(u,v,x2);MinBNbrModN(u,v,w,TNbr,NumLen);
MonMult(FAA,w,u);PlBNbrMN(u,v,u,TNbr,NumLen);MonMult(w,u,z2);
}
static boolean BIsZero(int Nbr[]){
for(int i=0;i<NumLen;i++) if(Nbr[i]!=0)return false;
return true;
}
static public void GcdBN(int Nbr1[],int Nbr2[],int Gcd[],int NumLen){
int i,k;
System.arraycopy(Nbr1,0,CAGCDU,0,NumLen);System.arraycopy(Nbr2,0,CAGCDV,0,NumLen);
for(i=0;i<NumLen;i++) if(CAGCDU[i]!=0)break;
if(i==NumLen){
System.arraycopy(CAGCDV,0,Gcd,0,NumLen);
return;
}
for(i=0;i<NumLen;i++)if(CAGCDV[i]!=0) break;
if(i==NumLen){
System.arraycopy(CAGCDU,0,Gcd,0,NumLen);
return;
}
if(CAGCDU[NumLen-1]>=0x40000000L) CSBN(CAGCDU,NumLen);
if(CAGCDV[NumLen-1]>=0x40000000L) CSBN(CAGCDV,NumLen);
k=0;
while((CAGCDU[0]&1)==0&&(CAGCDV[0]&1)==0){
k++;
DBNBL(CAGCDU,2,CAGCDU,NumLen);DBNBL(CAGCDV,2,CAGCDV,NumLen);
}
if((CAGCDU[0]&1)==1){
System.arraycopy(CAGCDV,0,CAGCDT,0,NumLen);CSBN(CAGCDT,NumLen);
}else System.arraycopy(CAGCDU,0,CAGCDT,0,NumLen);
do{
while((CAGCDT[0]&1)==0)DBNBL(CAGCDT,2,CAGCDT,NumLen);
if(CAGCDT[NumLen-1]<0x40000000L) System.arraycopy(CAGCDT,0,CAGCDU,0,NumLen);
else{
System.arraycopy(CAGCDT,0,CAGCDV,0,NumLen);
CSBN(CAGCDV,NumLen);
}
MinBNbR(CAGCDU,CAGCDV,CAGCDT,NumLen);
for(i=0;i<NumLen;i++) if(CAGCDT[i]!=0) break;
}while(i!=NumLen);
System.arraycopy(CAGCDU,0,Gcd,0,NumLen);
while(k>0){
PlBNb(Gcd,Gcd,Gcd,NumLen);k--;
}
}
static void PlBNb(int Nbr1[],int Nbr2[],int Sum[],int NumLen){
long cry=0;
for(int i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Nbr1[i]+(long)Nbr2[i];
Sum[i]=(int)(cry&fff);
}
}
static void DBNBL(int DND[],long DV,int Quotient[],int NumLen) {
int i;long Divid,Rem=0;
if(DND[i=NumLen-1]>=0x40000000) Rem=DV-1;
for( ;i>=0;i--){
Divid=DND[i]+(Rem<<31);
Rem=Divid-(Quotient[i]=(int)(Divid/DV))*DV;
}
}
static void CSBN(int Nbr[],int NumLen){
int cry=0;
for(int i=0;i<NumLen;i++) {
cry=(cry>>31)-Nbr[i];
Nbr[i]=cry&ff8;
}
}
static void MinBNbR(int Nbr1[],int Nbr2[],int Diff[],int NumLen){
long cry=0;
for(int i=0;i<NumLen;i++){
cry=(cry>>31)+(long)Nbr1[i]-(long)Nbr2[i];
Diff[i]=(int)(cry&fff);
}
}
static void prac(int n,int[] x,int[] z,int[] xT,int[] zT,int[] xT2,int[] zT2){
int d,e,r,i;
int[] t;int[] xA=x,zA=z;int[] xB=fAux1,zB=fAux2;int[] xC=fAux3,zC=fAux4;
double v[] ={1.61803398875,1.72360679775,1.618347119656,1.617914406529,1.612429949509,1.632839806089,1.620181980807,1.580178728295,1.617214616534,1.38196601125 };
r=L_Cost(n,v[0]);i=0;
for(d=1;d<10;d++){
e=L_Cost(n,v[d]);
if(e<r){
r=e;
i=d;
}
}
d=n;r=(int)((double) d/v[i]+0.5);d=n-r;e=2*r-n;
System.arraycopy(xA,0,xB,0,NumLen);System.arraycopy(zA,0,zB,0,NumLen);
System.arraycopy(xA,0,xC,0,NumLen);System.arraycopy(zA,0,zC,0,NumLen);
Dup(xA,zA,xA,zA);
while(d!=e){
if(d<e){
r=d;d=e;e=r;t=xA;xA=xB;xB=t;t=zA;zA=zB;zB=t;
}
if(4*d<=5*e&&((d+e)%3)==0){
r=(2*d-e)/3;e=(2*e-d)/3;d=r;
add3(xT,zT,xA,zA,xB,zB,xC,zC);add3(xT2,zT2,xT,zT,xA,zA,xB,zB);add3(xB,zB,xB,zB,xT,zT,xA,zA);
t=xA;xA=xT2;xT2=t;t=zA;zA=zT2;zT2=t;
}else if(4*d<=5*e&&(d-e)%6==0){
d=(d-e)/2;add3(xB,zB,xA,zA,xB,zB,xC,zC);Dup(xA,zA,xA,zA);
}else if(d<=(4*e)){
d-=e;add3(xT,zT,xB,zB,xA,zA,xC,zC);t=xB;xB=xT;xT=xC;xC=t;t=zB;zB=zT;zT=zC;zC=t;
}else if((d+e)%2==0){
d=(d-e)/2;add3(xB,zB,xB,zB,xA,zA,xC,zC);Dup(xA,zA,xA,zA);
}else if(d%2==0){
d /= 2;add3(xC,zC,xC,zC,xA,zA,xB,zB);Dup(xA,zA,xA,zA);
}else if(d%3==0){
d=d/3-e;Dup(xT,zT,xA,zA);add3(xT2,zT2,xA,zA,xB,zB,xC,zC);
add3(xA,zA,xT,zT,xA,zA,xA,zA);add3(xT,zT,xT,zT,xT2,zT2,xC,zC);t=xC;
xC=xB;xB=xT;xT=t;t=zC;zC=zB;zB=zT;zT=t;
}else if((d+e)%3==0){
d=(d-2*e)/3;add3(xT,zT,xA,zA,xB,zB,xC,zC);add3(xB,zB,xT,zT,xA,zA,xB,zB);
Dup(xT,zT,xA,zA);add3(xA,zA,xA,zA,xT,zT,xA,zA);
}else if((d-e)%3==0){
d=(d-e)/3;add3(xT,zT,xA,zA,xB,zB,xC,zC);add3(xC,zC,xC,zC,xA,zA,xB,zB);t=xB;xB=xT;xT=t;
t=zB;zB=zT;zT=t;Dup(xT,zT,xA,zA);add3(xA,zA,xA,zA,xT,zT,xA,zA);
}else if(e%2==0){
e /= 2;add3(xC,zC,xC,zC,xB,zB,xA,zA);Dup(xB,zB,xB,zB);
}
}
add3(x,z,xA,zA,xB,zB,xC,zC);
}
static BigInteger IntToNbr(int[] GD,int NumLen){
byte[] Result;
long[] Temp;long digit;
int i,NL;
Temp=new long[NumLen];C31To32(GD,Temp,NumLen);NL=NumLen*4;
Result=new byte[NL];
for(i=0;i<NumLen;i++){
digit=Temp[i];Result[NL-1-4*i]=(byte)(digit&0xFF);
Result[NL-2-4*i]=(byte)(digit/0x100&0xFF);Result[NL-3-4*i]=(byte)(digit/0x10000&0xFF);Result[NL-4-4*i]=(byte)(digit/0x1000000&0xFF);
}
return (new BigInteger(Result));
}
static int L_Cost(int n,double v){
int c,d,e,r;
d=n;r=(int)((double) d/v+0.5);
if(r>=n)return (6*n);
d=n-r;e=2*r-n;c=5+6;
while(d!=e){
if(d<e){
r=d;d=e;e=r;
}
if(4*d<=5*e&&((d+e)%3)==0){
r=(2*d-e)/3;e=(2*e-d)/3;d=r;c+=3*6;
}else if(4*d<=5*e&&(d-e)%6==0){
d=(d-e)/2;c+=6+5;
} else if(d<=(4*e)){
d-=e;c+=6;
}else if((d+e)%2==0){
d=(d-e)/2;c+=6+5;
}else if(d%2==0){
d /= 2;c+=6+5;
}else if(d%3==0){
d=d/3-e;c+=3*6+5;
}else if((d+e)%3==0){
d=(d-2*e)/3;c+=3*6+5;
}else if((d-e)%3==0){
d=(d-e)/3;c+=3*6+5;
}else if(e%2==0){
e /= 2;c+=6+5;
}
}
return (c);
}
static void karaMp(int idFa1,int length,int endId){
int idFa2=idFa1+length,i,offs,cry,cry2,tmp,mid;
boolean sign;
if(length<=64){
for(i=length-1;i>=0;i--)if(aNbr[idFa1+i]!=0) break;
if(i>=0)for(i=length-1;i>=0;i--)if(aNbr[idFa2+i]!=0) break;
if(i<0){
for(i=length-1;i>=0;i--)aNbr[idFa1+i]=aNbr[idFa2+i]=0;
return;
}
MoMp(idFa1,length);
}
int HalLen=length/2;
for(i=idFa1+HalLen;i<idFa2;i++){
tmp=aNbr[i];aNbr[i]=aNbr[i+HalLen];aNbr[i+HalLen]=tmp;
}
sign=absMn(idFa1,idFa2,endId,HalLen);
sign=absMn(idFa2+HalLen,idFa1+HalLen,endId+HalLen,HalLen)!=sign;
mid=endId;endId+=length;
karaMp(idFa1,HalLen,endId);
karaMp(idFa2,HalLen,endId);
karaMp(mid,HalLen,endId);
if(sign)
if(absMn(idFa1,mid,mid,length)){
absMn(idFa2,mid,mid,length);cry2=0;
}else
cry2=karaAdd(idFa2,mid,mid,length);
else{
cry2=karaAdd(idFa1,mid,mid,length);
cry2+=karaAdd(idFa2,mid,mid,length);
}
cry=0;
offs=idFa1+HalLen;
for(i=0;i<length;i++){
cry+=aNbr[offs+i]+aNbr[mid+i];
if(cry<0){
aNbr[offs+i]=cry-(-0x80000000);cry=1;
}else{
aNbr[offs+i]=cry;cry=0;
}
}
aNbr[idFa1+HalLen+i]+=cry+cry2;
if(aNbr[idFa1+HalLen+i]<0){
aNbr[idFa1+HalLen+i]-=(-0x80000000);
for(i=HalLen+1;i<length;i++){
if(++aNbr[idFa1+i]>=0)break;
aNbr[idFa1+i]=0;
}
}
}
static int karaAdd(int IdAd1,int IdAd2,int idxSum,int length){
int cry=0;
for(int i=0;i<length;i++){
cry+=aNbr[IdAd1+i]+aNbr[IdAd2+i];
if(cry<0){
aNbr[idxSum+i]=cry-(-0x80000000);
cry=1;
}else{
aNbr[idxSum+i]=cry;cry=0;
}
}
return cry;
}
static boolean absMn(int IDMind,int IdStN,int IdRlt,int length){
boolean sign=false;
int cry=0,i;
int[] arrNbr1=aNbr;
for(i=length-1;i>=0;i--)if(arrNbr1[IDMind+i]!=arrNbr1[IdStN+i])break;
if(i>=0&&arrNbr1[IDMind+i]<arrNbr1[IdStN+i]){
sign=true;i=IDMind;IDMind=IdStN;IdStN=i;
}
for(i=0;i<length;i++) {
cry=arrNbr1[IDMind+i]-arrNbr1[IdStN+i]-cry;
if(cry<0){
arrNbr1[IdRlt+i]=cry+(-0x80000000);cry=1;
}else{
arrNbr1[IdRlt+i]=cry;cry=0;
}
}
return sign;
}
static void GENsv(int initial,byte[] sv,byte[] sv2310,int[] SP){
int i,j,Q;
for(i=0;i<23100;i+=2310)System.arraycopy(sv2310,0,sv,i,2310);
j=5;Q=13;
do{
if(initial>Q*Q)
for(i=(int)(((long)initial*((Q-1)/2))%Q);i<23100;i+=Q)sv[i]=1;
else{
i=Q*Q-initial;
if(i<46200)for(i=i/2;i<23100;i+=Q)sv[i]=1;
else break;
}
Q=SP[++j];
}while(Q<5000);
}
static long RDBNL(int Dvd[],long Div,int NumLen){
int i;
long Rem=0;
long Mod2_31;
int divis = (int)Div;
Mod2_31 = ((-2147483648)-divis)%divis;
if (Dvd[i = NumLen - 1] >= 0x40000000)

Rem = Div - 1;

for ( ; i >= 0; i--)
{
Rem = Rem * Mod2_31 + Dvd[i];
do
{
Rem = (Rem >> 31)*Mod2_31+(Rem & 0x7FFFFFFF);
} while (Rem > 0x1FFFFFFFFL);
}
return Rem % divis;
}
public static void main(String[] args) {
TM=System.currentTimeMillis();
Scanner in=new Scanner(System.in);
BigInteger factor,TMP;
BigInteger[]Que =new BigInteger[100];
BigInteger[]rlt = new BigInteger [4000];
BigInteger inf = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
int Tc,i,j,k,cnt;
for(i=2;i<363;i++)if(Chk[i]==0)for(j=i*i;j<MX;j+=i)Chk[j]=1;
for(i=2;i<MX;i++)if(Chk[i]==0)P[Pn++]=i;
for(Tc=in.nextInt(),k=0;k<Tc;k++) {
TFac=new BigInteger(in.next());
NumLen=NbrToInt(TFac,TNbr);
cnt=0;
while((TNbr[0]&1)==0){
	Val[k][Cn[k]++]=2;
DBNBL(TNbr,2,TNbr,NumLen);
}
for(i=1;i<Pn;i++){
while(RDBNL(TNbr,P[i],NumLen)==0){
	Val[k][Cn[k]++]=P[i];
DBNBL(TNbr,P[i],TNbr,NumLen);
}
}
val[k]=IntToNbr(TNbr,NumLen);

}
while(true){
if(System.currentTimeMillis()-TM>Tsup)break;
for(k=0;k<Tc;k++){
if(Cn[k]>80&&val[k].compareTo(one)>0&&val[k].compareTo(inf)<0){
EC=1;TMP=fnECM(val[k]);
if(TMP.compareTo(one)>0){
	val[k]=val[k].divide(TMP);
	res[k][Ren[k]++]=TMP;
}
}
}
}

for(k=0;k<Tc;k++){
if(val[k].compareTo(one)>0){
System.out.println(Ren[k]+Cn[k]+1);
System.out.println(val[k]);
}else{
System.out.println(Ren[k]+Cn[k]);
}
for(i=0;i<Cn[k];i++)System.out.println(Val[k][i]);
for(i=0;i<Ren[k];i++)System.out.println(res[k][i]);
}
}
}