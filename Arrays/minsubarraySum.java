//min subarray sum

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,50};
		int min_sum = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++){
			//start = i
			for(int j = i; j<arr.length; j++){
				//end = j
				int temp = 0;
				for(int k = i; k<=j; k++){
					temp+=arr[k];					
				}
				if(temp < min_sum){
					min_sum = temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Max subarray sum : "+ min_sum);
	}
}