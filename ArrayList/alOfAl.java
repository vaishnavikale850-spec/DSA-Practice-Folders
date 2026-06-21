import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		ArrayList<Integer> al4 = new ArrayList<>();
		ArrayList<Integer> al5 = new ArrayList<>();
		
		for(int i = 1; i<=5; i++){
			al1.add(i);
			al2.add(2*i);
			al3.add(3*i);
			al4.add(4*i);
			al5.add(5*i);
		}

		mainlist.add(al1);
		mainlist.add(al2);
		mainlist.add(al3);
		mainlist.add(al4);
		mainlist.add(al5);
		System.out.println(mainlist);
	}
}