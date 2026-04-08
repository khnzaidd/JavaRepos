import java.util.Scanner;
class ArrayException{
	public static void main(String[] args){
		int[] arr={5,7,8,9,10,11,13,56,88,98};
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter no. of elements to be processed");
		x=sc.nextInt();
		for (int i=0;i<x;i++){
			System.out.println(++ arr[i]);
		}
	}
}
