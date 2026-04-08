#include <stdio.h>
void radixsort(int* ,int );
void printArray(int* ,int );
void countingsort(int* ,int ,int );

void radixsort(int* a,int len){
	int numlen=0;
	int quo=0;
	int max=a[0];
	for(int i=1;i<len;i++){
		if (max<a[i]) max=a[i];
	}
	while(max !=0){
		numlen++;
		max=max/10;
	}
	for(int i=1;i<=numlen;i++){
		countingsort(a,len,i);
	}
}

int main(){
	int a[]={213,115,125,112,121,115,187};
	int length=sizeof(a)/sizeof(a[0]);
	printArray(a,length);
	radixsort(a,length);
	printArray(a,length);
	return 0;
}

void printArray(int* a,int len){
	int i;
	for(i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}

void countingsort(int* a,int len,int pos){
	int c[10]={0};
	int b[len];
	for(int i=0;i<len;i++) b[i]=0;

	int i;
	for(int i=0;i<len;i++){
		int p=0;
		int q=a[i];
		for(int j=1;j<=pos;j++){
			p=q%10;
			q=q/10;
		}
		c[p]++;
	}
	for(int i=1;i<10;i++){
		c[i]=c[i]+c[i-1];
	}
	for(int j=len-1;j>=0;j--){
		int p=0;
		int q=a[j];
		for(int k=1;k<=pos;k++){
			p=q%10;
			q=q/10;
		}
		b[c[p]-1]=a[j];
		c[p]--;
	}
	for(int i=0;i<len;i++){
		a[i]=b[i];
	}
}
