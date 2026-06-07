//Best time to Buy and selling the stock- T.C. = O(n)

import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {4,7,9,11,2,15,4};
		int buyPrice = Integer.MAX_VALUE; //buyprice can predict lowest stock price
		int maxProfit = 0;
		
		// arr[i] = selling price

		for(int i = 0; i<arr.length; i++){
			if(buyPrice<arr[i]){
				int profit = arr[i] - buyPrice;

				maxProfit = Math.max(profit, maxProfit);
			}
			else{
				buyPrice = arr[i];
			}	
		}

		System.out.println(Arrays.toString(arr));
		System.out.print("Max Profit : "+ maxProfit);
	}
}