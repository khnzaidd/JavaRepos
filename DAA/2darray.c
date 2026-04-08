#include <stdio.h>
void printArray(int,int,int(*)[]);
int main(int argc,char** argv){
	int td[3][4]={{2,4,6,8},{1,3,7,5},{7,8,16,22}};
	int row=sizeof(td)/sizeof(td[0]);
	int col=sizeof(td[0])/sizeof(td[0][0]);
	printArray(row,col,td);
	return 0;
}
void printArray(int row,int col,int a[row][col]){
	int i,j;
	for(i=0;i<row;i++){
		for(j=0;j<col;j++){
			printf("%d\t", a[i][j]);
		}
		printf("\n");
	}
}
