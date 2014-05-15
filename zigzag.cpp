//BiangHoo May 2014
//Description:print out the zigzag array
//Reference:http://www.cnblogs.com/emituofo/archive/2012/07/24/2607179.html
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