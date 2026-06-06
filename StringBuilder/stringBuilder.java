/*
StringBuilder = It is a mutable (which can modified) sequence of characters.
It can modify the same obj.

Internal working of stringbuilder =
1. character array
2.16 capacity = (0 - 15)

*/
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder();//Empty Builder

		StringBuilder sb1 = new StringBuilder("Hello");//Initial Builder
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder(100); // capacity is 100

		System.out.println(sb1.append(" Java"));
	}
}