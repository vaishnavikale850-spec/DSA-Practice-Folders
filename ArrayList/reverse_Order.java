/*
Collections = class 
Collection = interface

Collections.sort() = method in AL
 Comparator = Collections.reverseOrder(); = descending order sorting

import java.util.Arraylist;
import java.util.Collections;
Collections.sort(al, Collections.reverseOrder());
*/



import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(18);
		al.add(1);
		al.add(3);
		al.add(42);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}