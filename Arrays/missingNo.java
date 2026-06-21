import java.util.*;
class Demo{
    public static void main(String[]args) {
	int[] nums = {3,2,0};
	int n = nums.length;
	int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
       int res = (n*(n+1))/2 - sum;
        System.out.println(res);
    }
}