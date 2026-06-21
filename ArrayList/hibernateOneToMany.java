import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<String>al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Flutter");

		Student s1 = new Student("Radha", 123, al1);
		Student s2 = new Student("Arati", 456, al);
	
		System.out.println("Student is "+s1.getName() + " Courses are " + s1.getAdd().getCourseName1() + " and " + s1.getAdd().getCourseName2());
		System.out.println("Student is "+s2.getName() + " Courses are " + s2.getAdd().getCourseName1() );
	}
}

class Courses{
	String c_name;

	Courses(String c_name){
		this.c_name = c_name;
	}

	
	String getCourseName(){
		return c_name;
	}


class Student{
	String name;
	int phoneNo;
	ArrayList<Courses> als;	

	Student(String name, int phoneNo){
		this.name = name;
		this.phoneNo = phoneNo;
		als = new ArrayList<>();
	}

	void addCourses(Courses als){
		als.add(als);
	}
	String getName(){
		return name;
	}

	int getNum(){
		return phoneNo;
	}

	

}
}