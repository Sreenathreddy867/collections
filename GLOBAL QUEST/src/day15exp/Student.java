package day15exp;

public class Student {
	private int id;
	private int age;
	private String name;

	
	 public Student() {
		 System.out.println("Zero param");
	}
	 
	public Student(int id,int age) {
		
		this.id=id;
		this.age=age;
	}

	public Student(int id, int age, String name) {
		this();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return id+" "+age+" "+name;
		
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(100,22);
		Student s3=new Student(100,23,"sree");
		System.out.println(s2);
		System.out.println(s3);
	}

	

}
