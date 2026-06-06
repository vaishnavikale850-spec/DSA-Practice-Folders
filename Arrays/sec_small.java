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

		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Min : " + arr[1]);
	}
}