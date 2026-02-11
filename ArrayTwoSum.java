class ArrayTwoSum{
	public static void main(String[] args){
		int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][] brr={{5,4,3,2},{7,8,9,10},{1,1,1,1},{2,3,4,5}};
		int [][] crr=new int[arr.length][arr[0].length];
		for (int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr.length==brr.length && arr[0].length==brr[0].length){
					crr[i][j]=arr[i][j]+brr[i][j];
				}else{
					System.out.println("not possible");
				}
			}
		}
		for(int k=0;k<arr.length;k++){
			for(int j=0;j<arr[k].length;j++){
				System.out.print(crr[k][j]+"  ");
			}
			System.out.println();
		}
	}
}
