//keySet();
import java.util.*;
class Demo{
	public static void main(String[]args){

		int [] arr = {1,2,3,3,2,1,1};
		HashMap < Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int op = -1;
		int min = Integer.MAX_VALUE;
		for(int key : ){
			if(hm.get(key)<hm.keySet()){
				op = key;
				min = hm.get(key);
			}
		}
		System.out.println(op + " appears minimum : " + min + " times");

	}
}