import java.util.*;
class Demo{

	public static void swapping(ArrayList<Integer>al , int index1, int index2){
		int num1 = al.get(index1);
		int num2 = al.get(index2);

		al.set(index2, num1);
		al.set(index1, num2);

		System.out.println(al);
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);

		System.out.print("Enter index 1 : ");
		int index1 = sc.nextInt();

		System.out.print("Enter index 2 : ");
		int index2 = sc.nextInt();
		
		swapping(al, index1, index2);
		
	}
}