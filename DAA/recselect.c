#include <stdio.h>
void selectionsort(int *a,int len){
	if(len<=1) return;
	int min_index=0;
	for(int i=1;i<len;i++){
		if(a[i]<a[min_index]){
			min_index=i;
		}
	}
	int temp=a[min_index];
	a[min_index]=a[0];
	a[0]=temp;
	selectionsort(a+1,len-1);
}

int main(){
	int arr[]={64,25,12,22,11};
	int n=sizeof(arr)/sizeof(arr[0]);
	selectionsort(arr,n);
	printf("sorted array:\n");
	for(int i=0;i<n;i++){
		printf("%d\t",arr[i]);
	}
	printf("\n");
	return 0;
}
