//BiangHoo May 2014
//Description:print out the zigzag array
//Reference:http://www.cnblogs.com/emituofo/archive/2012/07/24/2607179.html
/*    1     5     6    14    15    27    28
    4     7    13    16    26    29    42
    8    12    17    25    30    41    43
   11    18    24    31    40    44    53
   19    23    32    39    45    52    54
   22    33    38    46    51    55    60
   34    37    47    50    56    59    61
   36    48    49    57    58    62    63
*/
#include<iostream>
#include<cstdio>
using namespace std;
int main(){
	int N;
	int s,i,j,dir;
	int squa;
	cin>>N;
	int a[N][N];
	squa=N*N;
	i=0;//row
	j=0;//collum
	s=0;//count
	dir=0;//0=right,1=left-down;2=down;3=right-up;
	while(s<squa){
		a[i][j]=s;
		switch(dir){
			case 0:
				j++;
				if(0==i)
					dir=1;
				if(N-1==i)
					dir=3;
				break;
			case 1:
				j--;
				i++;
				if(0==j)
					dir=2;
				if(N-1==i)
					dir=0;
				break;
			case 2:
				i++;
				if(0==j)
					dir=3;
				if(N-1==j)
					dir=1;
				break;
			case 3:
				i--;
				j++;
				if(N-1==j)
					dir=2;
				if(0==i)
					dir=0;
				break;
			default:
				break;
		}
		s++;
	}
	for(i=0;i<N;i++){
		for(j=0;j<N;j++){
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
}