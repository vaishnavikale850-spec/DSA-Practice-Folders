/*Given an integer array arr, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		int count = 0;
		boolean isFound = false;
		int num = 0;
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count >= 1){
				isFound = true;
				num = arr[i];
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.print(isFound +" and num is " + num);
	}
}