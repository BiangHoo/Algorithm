//BiangHoo May 2014
//Description：classical joseph problem ,N men ,count from the K th person with a circle of M.
#include<iostream>
using namespace std;
typedef struct node{
	int val;
	struct node *pNext;
}Node,*pNode;
void joseph(int n,int k,int m){
	pNode head=new Node;
	head->val=1;
	head->pNext=NULL;
	pNode curr=head;
	for(int i=2;i<=n;i++){
		pNode tmp=new Node;
		tmp->val=i;
		tmp->pNext=NULL;
		curr->pNext=tmp;
		curr=tmp;
	}
	curr->pNext=head;
	curr=head;
	k=k-1;
	while(k--){
		curr=curr->pNext;
	}
	cout<<"k:"<<curr->val<<endl;
	while(n--){
		pNode pTmp;
		for(int i=0;i<m;i++){
			pTmp=curr;
			curr=curr->pNext;
		}
		pNode pN =curr;
		cout<<pN->val<<endl;
		pTmp->pNext=curr->pNext;
		curr=pTmp;
		delete pN;
	}
}
int main(){
	joseph(10,2,4);
	return 0;
}
