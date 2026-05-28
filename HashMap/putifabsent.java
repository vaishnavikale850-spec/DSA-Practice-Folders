/*putIfAbsent();

parameters = 2 key and value
if key exist = not added
if not exist = add in hashmap
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap <String, Integer> hm = new HashMap<>();
		hm.put("Vaishnavi", 20);
		hm.put("Radha", 16);
		hm.put("Abhinav", 17);
		hm.put("Rahul", 14);
		System.out.println(hm);
		hm.putIfAbsent("Raj", 16);
		System.out.println(hm);
	}
}