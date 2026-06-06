/*
substring() = return the piece of stringbuilder from start index to end - 1 index.
parameter = int, int
return = stringbuilder
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		System.out.println(sb.substring(3,5));
	}

}