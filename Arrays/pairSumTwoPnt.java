//Pair Sum TC = O(n) by two pointer and array is sorted

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,50};
		int target = 90;
		int op [] = new int[2];
		int i = 0; 
		int j = arr.length-1;
		while(i<j){
			if(arr[i] + arr[j] == target){
				op[0] = i;	
				op[1] = j;
				break;
			}
			else if(arr[i]+arr[j] > target){
				j--;
			}
			else{
				i++;
			}			
		}
		System.out.println(Arrays.toString(op));
	}
}