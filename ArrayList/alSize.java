/*
4. size() = return length of al 
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
		System.out.println(al.size());
		System.out.println("---------------");
		System.out.println("Elements are ");

		for(int i = 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}