/*
ArrayList = ArrayList is used when dynamic sizing is required.
ArrayList store collection and stored data of object type not primitive data type.

Methods 
1.  add = al.add(index) = last add = O(1)
2. add = al.add(index, value); = reach that index store value = O(n)
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(9);
		al.add(12);
		al.add(23);
		al.add(15);

		System.out.println(al);
		al.add(2, 18);
		System.out.println(al);
	}
}
