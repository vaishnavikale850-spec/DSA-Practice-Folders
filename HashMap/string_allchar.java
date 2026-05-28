//Out of memeory i.e segmaentation error occurs so to solve this issue we use hashmap data structure in collection in java.
import java.util.*;
class Demo{
	public static void main(String[]args){
		String str = "abcdeab^%@#$)(*&^huyd";
		int freq[] =  new int[265];
		for(int i = 0; i<str.length(); i++){
			freq[str.charAt(i)]++;
		}		
		System.out.println(Arrays.toString(freq));
		System.out.println(freq[116]);
	}
}