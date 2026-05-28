import java.util.*;
class Demo{
	public static void main(String[]args){

		int [] arr = {1,1,2,3,4,5,12,3,3,3,5};
		HashMap < Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int op = -1;
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
			if(entry.getValue()>max){
				max = entry.getValue();
				op = entry.getKey();
			}
		}
		System.out.println(op + " appears : " + max + " times");

	}
}