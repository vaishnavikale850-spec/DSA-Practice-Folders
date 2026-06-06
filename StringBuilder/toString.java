/*
toString() = return the string by converting stringbuilder parameter = no
return = string
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("String Builder : " + sb);

		String s = sb.toString();
		System.out.println("String : " + s);
	}

}