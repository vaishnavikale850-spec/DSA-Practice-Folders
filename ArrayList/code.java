import java.util.*;
class Demo{
	public static void main(String[]args){
		Courses c1 = new Courses("Java", "Flutter");
		Courses c2 = new Courses("Python");

		Student s1 = new Student("Radha", 123, c1);
		Student s2 = new Student("Arati", 456, c2);
	
		System.out.println("Student is "+s1.getName() + " Courses are " + s1.getAdd().getCourseName1() + " and " + s1.getAdd().getCourseName2());
		System.out.println("Student is "+s2.getName() + " Courses are " + s2.getAdd().getCourseName1() );
	}
}

class Courses{
	String c_name1;
	String c_name2;

	Courses(String c_name1){
		this.c_name1 = c_name1;
	}
	
	Courses(String c_name1, String c_name2 ){
		this.c_name1 = c_name1;
		this.c_name2 = c_name2;
	}

	
	String getCourseName1(){
		return c_name1;
	}

	String getCourseName2(){
		return c_name2;
	}


class Student{
	String name;
	int phoneNo;
	Courses c;	
	Student(String name, int phoneNo, Courses c){
		this.name = name;
		this.phoneNo = phoneNo;
		this.c = c;
	}

	String getName(){
		return name;
	}

	int getNum(){
		return phoneNo;
	}

	Courses getAdd(){
		return c;
	}

}
}