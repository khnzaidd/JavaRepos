#include <stdio.h>
void bubblesort(int *a,int len){
	int flag=0;
	int i,j,temp;
	for(i=1;i<len;i++){
		flag=0;
		for(j=1;j<len;j++){
			if(a[j-1]>a[j]){
				flag++;
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
		if (flag==0) break;
	}
}
int main(int argc,char **argv){
	int n,i;
	printf("Enter number of element: ");
	scanf("%d", &n);
	int a[n];
	printf("Enter %d elements:\n",n);
	for (i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	bubblesort(a,n);
	printf("Sorted array: ");
	for(i=0;i<n;i++){
		printf("%d",a[i]);
	}
	printf("\n");
	return 0;
}
