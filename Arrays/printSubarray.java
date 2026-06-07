//Print subarray in array
import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,50};
		int ts = 0;
		for(int i = 0; i<arr.length; i++){
			//start = i
			for(int j = i; j<arr.length; j++){
				//end = j
				for(int k = i; k<=j; k++){
					//print = k
					System.out.print(arr[k] + " ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.print("Total subarray : "+ ts);
	}
}