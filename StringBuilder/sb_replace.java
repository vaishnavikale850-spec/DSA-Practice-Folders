/* replace = 
parameter = int, int (start, end) ----> end = end - 1
return modified stringbuilder 
*/
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("Python");
		System.out.println("Starting stringbuilder : " + sb); //output : Python
		sb.replace(0,6,"Java");
		System.out.println("Starting stringbuilder : " + sb); //output : Java
	}
}