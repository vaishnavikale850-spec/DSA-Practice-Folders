//count freq of characters in string

import java.util.*;
class Demo{
	public static void main(String[]args){

		String str = "apple";
		HashMap < Character, Integer> hm = new HashMap<>();
		for(int i = 0; i<str.length(); i++){
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0) + 1 );
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()){
			System.out.println("Frequency of  "+ entry.getKey()  + " is " + entry.getValue() );
		}
	}
}