/*
3. remove(index); = remove value at given index

O(n)
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

		al.remove(2);
		System.out.println(al);

		al.removeAll(al);
		System.out.println(al);
	}
}
