//2. Remove = hm.remove(key); = delete entry.
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer>hm = new HashMap<>();
		System.out.println("Menu card ");
		hm.put("Dal Roti" , 100);
		hm.put("Samosa" , 20);
		hm.put("Vada Pav" , 15);
		hm.put("Dosa" , 40);
		System.out.println(hm);

		hm.remove("Dosa");
		System.out.println(hm);
	}
}