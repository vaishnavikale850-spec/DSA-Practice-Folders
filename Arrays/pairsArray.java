//Pairs in array
import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,30,40,50};
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				System.out.print("(" + arr[i] + "," + arr[j] +") ");
			}
			System.out.println();
		}
	}
}