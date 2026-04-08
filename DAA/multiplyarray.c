#include <stdio.h>
void multiply(int,int,int,int[][3],int[][3],int[][3]);
void printArray(int,int,int[][3]);

int main(){
	int a[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int b[3][3]={{9,8,7},{6,5,4},{3,2,1}};
	int result[3][3];
	int row1=3,col1=3,row2=3,col2=3;
	if(col1!=row2){
		printf("Matrix multiplication not possible\n");
		return 0;
	}
	multiply(row1,col1,col2,a,b,result);
	printf("Product of matrices:\n");
	printArray(row1,col2,result);
	return 0;
}

void printArray(int row,int col,int a[row][col]){
	for (int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
}

void multiply(int row1,int col1,int col2,int a[row1][col1],int b[col1][col2],int result[row1][col2]){
	int i,j,k;
	for(i=0;i<row1;i++){
		for(j=0;j<col2;j++){
			result[i][j]=0;
			for(k=0;k<col1;k++){
				result[i][j] += a[i][k] * b[k][j];
			}
		}
	}
}
