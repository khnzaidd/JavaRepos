#include <stdio.h>
void bubblesort(int *a, int len){
	if(len<=1) return;
	int i,temp;
	for(i=0;i<len-1;i++){
		if(a[i]>a[i+1]){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	bubblesort(a,len-1);
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
        bubblesort(arr,length);
        printf("Sorted array is: \n");
        printArray(arr,length);
        return 0;
}

