class TransposeDemo{
	public static void main(String[] args){
		int [][] arr={{2,7,15},{3,9,4},{5,10,6}};
		int temp;
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<i;j++){
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
