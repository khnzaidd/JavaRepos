class DemoSum{
	public static void main(String[] args){
		int[][] arr={{3,5,7,6},{4,8,9,0},{3,5,1,8}};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if((i+j)==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
