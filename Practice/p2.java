import java.util.*;
class Demo{
	public static void main(String[]args){
		int []nums = {100, 4, 200, 1,3,2};
		int count = 1;
		HashSet <Integer> hs = new HashSet<>();
		for(int key : nums){
			if(key == count){
				hs.add(key);
			}
		}
		System.out.println(hs.size());
	
	}
}