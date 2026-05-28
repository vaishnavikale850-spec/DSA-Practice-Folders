//KeySet();
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap <String, Integer> hm = new HashMap<>();
		hm.put("Vaishnavi", 20);
		hm.put("Radha", 16);
		hm.put("Abhinav", 17);
		hm.put("Rahul", 14);
		
		for(String student : hm.keySet()){
			System.out.println(student + " " + hm.get(student));
		}
	}
}