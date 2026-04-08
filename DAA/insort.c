#include <stdio.h>
void insertionsort(int *a,int len){
	int i,j;
	for(j=1; j<len; j++){
		int key=a[j];
		i=j-1;
		while(i>=0 && a[i]>key){
			a[i+1]=a[i];
			i--;
		}
		a[i+1]=key;
	}
}
void printArray(int *a,int len){
	int i;
	for(i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}

int main(){
	int arr[]={4,7,3,8,6,9,2,1};
	int length=sizeof(arr)/sizeof(arr[0]);
	printArray(arr,length);
	insertionsort(arr,length);
	printArray(arr,length);
	//printf("Sorted array is:  %d",sort);
}
