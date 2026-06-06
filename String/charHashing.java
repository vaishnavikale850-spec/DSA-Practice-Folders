//Time complexity = O(n)
import java.util.*;
class Demo{
	public static void main(String[]args){
		String name = "vaishnavi";
		int freq[] = new int[26];
		for(int i = 0; i<name.length(); i++){
			freq[name.charAt(i) -'a']++;
		}
		for(int i = 0; i<freq.length; i++){
			System.out.println(i  + " : " + freq[i]);
		}
	}
}