import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter number : ");
			arr[i] = sc.nextInt();
		}

		int max = 0;
		int sec_max = 0;

		HashMap <Integer, Integer>hm = new HashMap<>();
		
		for(int i = 0; i<arr.length; i++){
			hm.put(arr[i], 0);
		}

		for(int key : hm.keySet()){
			if(key>max){
				max = key;
			}
		}

		for(int key : hm.keySet()){
			if(key<max && sec_max < max){
				sec_max = key;
			}
		}
		System.out.println("Second Max : " + sec_max);

	}
}