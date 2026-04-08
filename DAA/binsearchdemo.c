#include <stdio.h>
int Binarysearch(int *a,int left,int right,int data){
	int mid;
	while(left<=right){
		mid=(left+right)/2;
		if(data==a[mid]){
			return mid;
		}else if(data<a[mid]){
			right=mid-1;
		}else{
			left=mid+1;
		}
	}
	return -1;
}
int main(){
	int arr[]={0,2,7,8,9,12,17,24,27,29,66,78,93};
	int length=sizeof(arr)/sizeof(arr[0]);
	int data;
	printf("Enter data to search\n");
	scanf("%d",&data);
	int result=Binarysearch(arr,0,length,data);
	if (result==-1) printf("Element not found\n");
	else printf("Data %d found at index %d\n",data,result);
	return 0;
}
