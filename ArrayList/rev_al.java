import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		for(int i = al.size()-1; i>=0; i--){
			System.out.println(al.get(i));
		}
	}
}