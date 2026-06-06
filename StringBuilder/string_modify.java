/*
Time Complexity = O(n^2) 
For each iteration =
1. New obj create
2. Old content copy
3. New content add 
4. new Obj return

Each class return it's object

*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		String s = " " ;
		for(int i = 0; i<100000; i++){
			s = s + "a";
		}
		System.out.println(s);
	}
}