/*
String = It is a class and also a derived data type which is used to store sequence of charaters. 

There are two ways to store the string 
1. String s = "Radha"; stored in scp (String Constatnt Pool)
2. String s = new String("Radha"); stored in heap 

String are immutable.
If we want to check wheather the content in a strings same or different we need a method isequals.

equals()  = This method return boolean output.
paarameter = string
return type = boolean
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		String name = "Vaishnavi";
		String name1 = "Vaishnavi"; // true
		// String name1 = "Vaishnavi Kale"; // false
		if(name.equals(name1)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}