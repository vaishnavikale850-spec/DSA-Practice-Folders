//Pair Sum TC = O(n^2)

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,50};
		int target = 90;
		int op [] = new int[2];
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == target){
						op[0] = i;	
						op[1] = j;
				}
			}
		}
		System.out.println(Arrays.toString(op));
	}
}