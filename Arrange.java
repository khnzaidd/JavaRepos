class Arrange{
	public static void main(String[] args){
		int[] arr={2,6,-8,1,5,9,-2,4,-18};
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j){
			while(i<arr.length&&arr[i]<0) i++;
			while(j>=0&&arr[j]>=0) j--;
			if(j>i){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+"  ");
		}
		System.out.println();
	}
}
