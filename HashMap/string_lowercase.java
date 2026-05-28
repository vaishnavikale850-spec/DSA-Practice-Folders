import java.util.*;
class Demo{
	public static void main(String[]args){
		String str = "abcdeabhuydsertyu";
		int freq[] =  new int[26];
		for(int i = 0; i<str.length(); i++){
			freq[str.charAt(i) - 'a']++;
		}		
		System.out.println(Arrays.toString(freq));
		System.out.println(freq[4]);
	}
}