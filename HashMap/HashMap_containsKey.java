/*4. containsKey(key); return boolean

if key exist = return value
if not exist = return null
*/
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
		System.out.println(hm.get("Momos"));
		System.out.println(hm.get("Vada Pav"));

		//containsKey(key)

		boolean f = hm.containsKey("Dosa");
		System.out.println(f);
		System.out.println(hm.containsKey("Idali"));
	}
}

/*import java.util.*;
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
		int v = hm.remove("Dosa");
		System.out.println(v);
		System.out.println(hm);
		int r = hm.remove("Rice");
		System.out.println(r);
		System.out.println(hm);		
		
	}
}
*/