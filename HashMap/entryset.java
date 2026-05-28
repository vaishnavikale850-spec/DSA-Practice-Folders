/*
Iteration
1. EntrySet = key value pairs
2. keySet = only keys 
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap <String, Integer> hm = new HashMap<>();

		
		for(Map.Entry<String,Integer>student : hm.entrySet()){
			System.out.println("Student is " + student.getKey() + " and marks are "+ student.getValue() );
		}
	}
}