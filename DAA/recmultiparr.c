#include <stdio.h>

void SMMR(int i,int j,int a[j+1][j+1], int b[j+1][j+1],int c[j+1][j+1]){
	if((j-1)==0){
		c[0][0]=a[0][0]*b[0][0];
	}else{
		c[i][j]=SMMR(i,j/2,a,b,c)+SMMR((i+1)+2),j,a,b,c);
		c[i][j+1]=SMMR(i,(j/2)+1,a,b,c)+SMMR((i+1)/2,(j/2)+1,a,b,c);
		c[i+1][j]=SMMR((i+1)/2,j/2,a,b,c)+SMMR((i+1)/2,(j/2)+1,a,b,c);
		c[i+1][j+1]=SMMR((i+1)/2,(j/2)+1,a,b,c)+SMMR((i+1)/2,j,a,b,c);
	}
	return 0;
}

int main(int argc,char** argv){
	int a[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int b[3][4]={{3,5,1},{8,4,7},{6,2,4}};
	int c[3][3];
	int row=3;
	int col=4;
	SMMR(row,col,a,b,c);
	printf("Product of matrices:\n");
	printArray(row,col,c);
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

