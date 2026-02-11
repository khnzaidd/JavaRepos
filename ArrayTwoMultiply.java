class ArrayTwoMultiply{
	public static void main(String[] args){
		int[][] arr={{1,2,3},{1,2,3},{1,2,3}};
		int[][] brr={{3,4,5},{3,4,5},{3,4,5}};
		if(arr[0].length==brr.length){
			int[][] crr=new int[arr.length][brr[0].length];
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<brr[0].length;j++){
					crr[i][j]=0;
					for(int k=0;k<arr[0].length;k++){
						crr[i][j] += arr[i][k]*brr[k][j];
					}
				}
			}
			for(int i=0;i<crr.length;i++){
				for(int j=0;j<crr[i].length;j++){
					System.out.print(crr[i][j]+"  ");
				}
				System.out.println();
			}
		}else{
			System.out.println("Multiplication not possible");
		}
	}
}
