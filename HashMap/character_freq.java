/*Time complexity =O(n)
character string 
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		String str = "abcdeabhuydsertyu";
		int counter = 0;
		char ch = 'e';
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ch){
				counter++;
			}
		}		
		System.out.println(counter);	
	}
}