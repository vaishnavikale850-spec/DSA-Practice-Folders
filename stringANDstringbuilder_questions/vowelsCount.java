import java.util.*;
class Demo{
	public static void main(String[]args){
		String s = "education";
		char freq[] = {'a','e','i','o','u'};
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			for(int j = 0; j<freq.length; j++){
				if(s.charAt(i) == freq[j]){
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}