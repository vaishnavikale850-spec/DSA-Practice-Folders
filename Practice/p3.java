import java.util.*;
class Demo{
	public static void main(String[]args){
		int []nums1 = {7, 3,9};
		int []nums2 = {6,3,9,2,9,4};
		
		HashSet <Integer> hs = new HashSet<>();
		for(int key : nums1){
			hs.add(key);
		}
		for(int key : nums2){
			hs.add(key);
		}
		System.out.println(hs);
		System.out.println(hs.size());
	
	}
}