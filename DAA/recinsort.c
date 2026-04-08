#include <stdio.h>
#include <stdlib.h>

void insertionsort(int *a,int len){
	if(len<=1) return;
	insertionsort(a,len-1);
	int last=a[len-1];
	int j=len-2;
	while(j>=0 && a[j]>last){
		a[j+1]=a[j];
		j--;
	}
	a[j+1]=last;
}

void printarray(int *a,int len){
	int i;
	for(i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}

int main(int argc,char** argv){
	int arr[]={5,3,7,112,10,2,1};
	int len=sizeof(arr)/sizeof(arr[0]);
	printf("unsorted array:\n");
	printarray(arr,len);
	insertionsort(arr,len);
	printf("sorted array:\n");
	printarray(arr,len);
	return 0;
}
