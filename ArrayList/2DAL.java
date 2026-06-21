//2D arraylist = ararylist of arraylist empty al add in main al
import java.util.*;
class Demo{
	public static void main(String[]args){

		
		ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		ArrayList<Integer> al4 = new ArrayList<>();
		ArrayList<Integer> al5 = new ArrayList<>();
		mainlist.add(al1);
		mainlist.add(al2);
		mainlist.add(al3);
		mainlist.add(al4);
		mainlist.add(al5);
		System.out.println(mainlist);
	}
}