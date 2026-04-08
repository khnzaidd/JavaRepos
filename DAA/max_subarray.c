#include <stdio.h>
#include <limits.h>
#include <stdlib.h>
int* fmcs(int* a,int low,int mid,int high){
	int* result=(int*)calloc(3,sizeof(int));
	int lsum=-INT_MAX;
	int rsum=-INT_MAX;
	int mleft;
	int mright;
	int sum=0,i,j;
	for(i=mid;i>=low;i--){
		sum+=a[i];
		if(sum>lsum){
			lsum=sum;
			mleft=i;
		}
	}
	sum=0;
	for(j=mid+1;j<=high;j++){
		sum+=a[j];
		if(sum>rsum){
			rsum=sum;
			mright=j;
		}
	}
	result[0]=mright;
	result[1]=mright;
	result[2]=lsum+rsum;
	return result;
}
int* findmaxsubarray(int* a,int low,int high){
	int* result=(int*)calloc(3,sizeof(int));
	if(high==low){
		result[0]=low;
		result[1]=high;
		result[2]=a[low];
		return result;
	}else{
		int mid=(low+high)/2;
		int *dl=findmaxsubarray(a,low,mid);
		int *dr=findmaxsubarray(a,mid+1,high);
		int *c=fmcs(a,low,mid,high);
		if((dl[2]>=dr[2])&&(dl[2]>=c[2])){
			return dl;
		}else if((dr[2]>=dl[2])&&(dr[2]>=c[2])){
			return dr;
		}else{
			return c;
		}
	}
}
void printArray(int* a,int length){
	int i;
	for(i=0;i<length;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}
int main(){
	int arr[]={3,5,-55,-7,34,7,-32,88,45,-26,13,-34,-19,-4,16,17};
	int length=sizeof(arr)/sizeof(arr[0]);
	printf("Array is:\n ");
	printArray(arr,length);
	int* res=findmaxsubarray(arr,0,length-1);
	printf("maximum subarray from index %d to %d with sum=%d\n",res[0],res[1],res[2]);
	free(res);
	return 0;
}
