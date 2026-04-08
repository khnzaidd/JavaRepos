#include <stdio.h>
void printArray(int,int,int(*)[]);
void sumArray(int,int,int(*)[],int(*)[],int(*)[]);
int main(int argc,char** argv){
        int a[3][4]={{1,2,3,8},{4,5,6,7},{7,8,9,6}};
        int b[3][4]={{3,5,1,4},{8,4,7,3},{6,2,4,2}};
	int row=3;
        int col=4;
        int result[3][4];
	sumArray(row,col,a,b,result);
        printArray(row,col,result);
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
void sumArray(int row,int col,int a[row][col],int b[row][col],int result[row][col]){
	int i,j;
	for (int i=0; i<row; i++){
		for (j=0; j<col; j++){
			result[i][j]=a[i][j]+b[i][j];
                }
        }
}






