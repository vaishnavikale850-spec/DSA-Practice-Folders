import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(98);
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(46);
		System.out.println(al);
		
		int max = Integer.MIN_VALUE;
		//int max = al.get(0);
		for(int i = al.size()-1; i>=0; i--){
			if(max<al.get(i)){
				max = al.get(i);
			}
		}
		System.out.println("Max element in AL : " + max);
	}
}