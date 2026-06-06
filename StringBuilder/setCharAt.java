/*
setCharAt() = set character in that index given of stringbuilder
parameter = int, character
return = stringbuilder
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.setCharAt(4,'l');
		System.out.println(sb);
	}

}