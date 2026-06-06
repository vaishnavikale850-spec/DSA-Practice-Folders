/*
deleteCharAt() = remove character from stringbuilder
parameter = int
return = stringbuilder
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}

}