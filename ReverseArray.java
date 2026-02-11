class ReverseArray{
	public static void main(String[] args){
		int[] arr={2,6,7,9,12,4,3};
		int i=0;
		int j=arr.length-1;
		do{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}while(i<j);
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+"  ");
		}
	System.out.println();
	}
}
