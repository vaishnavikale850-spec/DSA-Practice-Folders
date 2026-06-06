/*
If the length of stringbuilder becomes greater than 16 then the capacity of stringbuider increases from 16 to 34.
Capacity is calculated using 
new Capacity = (old capacity*2)+2
capacity = 16, 34, 70, 142

for both capacity and length
parameter = no
return integer
*/
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder();//Empty Builder
		System.out.println("Starting stringbuilder : " + sb);
		System.out.println("Length is " + sb.length()); //0
		System.out.println("Capacity is " + sb.capacity()); //16
		System.out.println("------------------");

		System.out.println(sb.append("Javafjkzxmsdwfghj"));
		System.out.println("Length is " + sb.length()); //10
		System.out.println("Capacity is " + sb.capacity()); //16

		System.out.println("------------------");
	}
}