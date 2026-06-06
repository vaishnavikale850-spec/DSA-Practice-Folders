/*delete = remove characters at given index.
parameter = int, int (start, end) ----> end = end - 1
return modified stringbuilder 
*/
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("Starting stringbuilder : " + sb); //output : hello
		sb.delete(3,5); //5-1 = 4
		System.out.println("After changes stringbuilder : " + sb); //output : hel
		sb.delete(3,10); // allowed
		System.out.println("After changes stringbuilder : " + sb); //output : hel
		sb.delete(2,3); // index2 character deleted
		System.out.println("After changes stringbuilder : " + sb); 
		sb.delete(3,0); // exception : index out of bound 
		System.out.println("After changes stringbuilder : " + sb); //error
	}
}