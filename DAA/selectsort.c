#include <stdio.h>
void selectionsort(int *a,int len){
	int i,j,min;
	for(i=0;i<len-1;i++){
		min=i;
		for(j=i+1;j<len;j++){
			if(a[j]<a[min]){
				min=j;
			}
		}
		swap(&a[i],&a[min]);
	}
}
void swap(int *a,int *b){
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
void printArray(int arr[],int len){
	int i,length;
	for(i=0;i<len;i++){
		printf("%d, ",arr[i]);
	}
	printf("\n");
}
int main(){
	int arr[]={4,6,12,66,8,78,45,27};
	int length=sizeof(arr)/sizeof(arr[0]);
	printf("Unsorted array is: \n");
	printArray(arr,length);
	selectionsort(arr,length);
	printf("Sorted array is: \n");
	printArray(arr,length);
	return 0;
}

