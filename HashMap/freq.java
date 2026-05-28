/*Time complexity =O(n)
freq[2] = 2 is the value consideration for T.C. so it becomes O(Q*n); linear time complexity

1. Segmenetation fault error
2. in main method = 10^6 operations get performed 
3. globally 10^7 time complexity consider.
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size : ");		
		int n = sc.nextInt();
		int [] arr = new int[n];
	
		for(int i = 0; i<n; i++){
			System.out.println("Enter element : ");	
			arr[i] = sc.nextInt();
		}

		int max = 0;
		for(int i = 0; i<n; i++){
			if(arr[i]>max){
				max = arr[i];
			}	
		}

		int []freq = new int[max+1];
		for(int i = 0; i<arr.length; i++){
			freq[arr[i]]++;
		}

		System.out.println(freq[2]);
		
	}
}