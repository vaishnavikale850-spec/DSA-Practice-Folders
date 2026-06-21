/*
3. contains(value); = check the value is exist in al or not .
return type = boolean
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
		System.out.println(al.contains(11));
		System.out.println(al.contains(12));
	}
}
