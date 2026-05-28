/*
Iteration
1. EntrySet = key value pairs
2. keySet = only keys 
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap <String, Integer> hm = new HashMap<>();
		hm.put("Vaishnavi", 20);
		hm.put("Radha", 16);
		hm.put("Abhinav", 17);
		hm.put("Rahul", 14);
		
		for(Map.Entry<String,Integer>student : hm.entrySet()){
			System.out.println("Student is " + student.getKey() + " and marks are "+ student.getValue() );
		}
	}
}