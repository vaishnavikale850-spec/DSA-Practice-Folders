/*insert = add or insert characters at given index.
parameter = int, stringbuilder
return modified stringbuilder 
*/
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Heloo");//Empty Builder
		System.out.println("Starting stringbuilder : " + sb);
		sb.insert(2,"l");
		System.out.println("After changes stringbuilder : " + sb);
	}
}