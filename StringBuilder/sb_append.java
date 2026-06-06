//append = add characters at end
class Demo{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder();//Empty Builder
		System.out.println(sb);
		System.out.println(sb.append("Java empty"));
		System.out.println("------------------");

		StringBuilder sb1 = new StringBuilder("Hello");//Initial Builder
		System.out.println(sb1);
		System.out.println(sb1.append(" Java initial"));
		System.out.println("------------------");

		StringBuilder sb2 = new StringBuilder(100); // capacity is 100
		System.out.println(sb2);
		System.out.println(sb2.append("Java capacity"));
		System.out.println("------------------");

	}
}