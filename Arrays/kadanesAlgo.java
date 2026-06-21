//max subarray sum - kadane's algorithm T.C. = O(n)

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,-50};
		int maxsum = Integer.MIN_VALUE;
		int cs = 0;
		for(int i = 0; i<arr.length; i++){
			cs +=arr[i];
		
			//arr[i] less than 0 add 0 for -ve values
			if(cs<0){
				cs = 0;
			}

			//calculate max from current sum &  max sum
			if(cs>maxsum){
				maxsum = cs;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Max subarray sum : "+ maxsum);
	}
}