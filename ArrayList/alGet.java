/*
2. get(index);
T.C = O(1)
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
		//Exception : IndexOutOfBoundsException
		//al.get(5);
		System.out.println(al.get(3));

		//both are applicable 
		int num = al.get(1);
		Integer num = al.get(1);
		System.out.println(num);
	}
}
