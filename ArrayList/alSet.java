/*
3. set(index, value); = remove existing value at given index and add new value.
T.C. = O(n)
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(9);
		al.add(11);
		al.add(19);
		System.out.println(al);

		al.set(1,10);
		System.out.println(al);
	}
}
