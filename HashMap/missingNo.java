import java.util.*;
class Demo{
    public static void main(String[]args) {
	int[] nums = {3,2,0};
	int op = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], 0);
        }
        for(int i = 0; i<=nums.length; i++){
            if(!hm.containsKey(i)){
                  op = i;
            }
        }
        System.out.println(op);
    }
}