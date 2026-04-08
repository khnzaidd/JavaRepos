#include <stdio.h>
int linearsearch(int a[],int len,int key,int index){
	if(index>=len) return -1;
	if(a[index]==key) return index;
	return linearseach(a,len,key,index+1);
}

void printArray(int a[],int len){
	for(int i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}

int main(){
	int arr[]={4,6,12,66,27,8,78,45};
	int length=sizeof(arr)/sizeof(arr[0]);
	int key;
	printf("Array elements are:\n");
	printArrray(arr,length);
	printf("Enter elements to search: ");
	scanf("%d",&key);
	int result=linearsearch(arr,length,key,0);
	if(result!=-1){
		printf("Element %d found at index %d\n",key,result);
	}else{
		printf("Element %d not found in the array.\n",key);
	}
	return 0;
}
