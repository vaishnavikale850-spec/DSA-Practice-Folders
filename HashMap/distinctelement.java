//Distinct elements in an array

import java.util.*;
class Demo{
	public static void main(String[]args){

		int [] arr = {1,2,3,3,2,1,1,4};
		HashMap < Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			hm.put(arr[i], 0);
		}
		int cnt = 0;
		for(int key : hm.keySet()){
			if(hm.containsKey(key)){
				cnt++;
			}
		}
		System.out.println("Distinct elements are " + cnt);
	}
}