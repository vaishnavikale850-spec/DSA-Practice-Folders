import java.util.*;
class Demo{
	public static void main(String[]args){
		int []nums1 = {7, 3,1,9};
		int []nums2 = {6,3,9,2,9,4,7,1};
		
		HashSet <Integer> hs = new HashSet<>();
		int count = 0;

		for(int i = 0; i< nums1.length;i++){
			hs.add(nums1[i]);
		}
		for(int i = 0; i< nums2.length;i++){
			if(hs.contains(nums2[i])){
				count++;
				hs.remove(nums2[i]);
			}

		}
		System.out.println(count);
	
	}
}