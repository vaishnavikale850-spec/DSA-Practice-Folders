/*
If we can't write generic type then any type of data and it inserted as an object <Object> this should have written.
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(10.6);
		al.add("abc");
		al.add(true);
		System.out.println(al);
	}
}