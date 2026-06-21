import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {1,2,3,4,5,6,7};
		int newarr[] = new int[arr.length];
		int k  = 3;
		int count = 0;
		
		while(count<k){
			int j = 0;
			for(int i = k+1; i<arr.length; i++){
				newarr[j] = arr[i];
				j++;
			}
			for(int i = 0; i<arr.length-k; i++){
				newarr[j] = arr[i];
				j++;
			}
			count++;
		}
		System.out.println(Arrays.toString(newarr));
	
	}
}