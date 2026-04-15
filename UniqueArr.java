import java.util.*;
class UniqueArr{
	public static void main(String[] args){
		int[] arr={2,4,6,8,10,12,2,7,8,3,8,2,8,0,10,44,22,2,99};
//		System.out.println("Size of array:-"+" "+ arr.length());
		Set<Integer> st=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			st.add(arr[i]);
		}
		System.out.println(st.size());
	}
}
