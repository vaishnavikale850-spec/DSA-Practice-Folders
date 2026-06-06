// Tme Complexity = O(n)
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

		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}

		System.out.println("Max : " + max);
	}
}