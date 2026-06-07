//max subarray sum T.C. = O(n^3)

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,-50};
		int sum = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++){
			//start = i
			for(int j = i; j<arr.length; j++){
				//end = j
				int temp = 0;
				for(int k = i; k<=j; k++){
					temp+=arr[k];					
				}
				if(temp > sum){
					sum = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Max subarray sum : "+ sum);
	}
}