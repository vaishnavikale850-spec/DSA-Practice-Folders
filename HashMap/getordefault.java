/*getOrDefault() 

parameters = 2 key and default value
if key exist = return value
if not exist = return default value
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap <String, Integer> hm = new HashMap<>();
		hm.put("Vaishnavi", 20);
		hm.put("Radha", 16);
		hm.put("Abhinav", 17);
		hm.put("Rahul", 14);

		System.out.println(hm.getOrDefault("Abhinav", 0));
		System.out.println(hm.getOrDefault("Ram", 0));
	}
}