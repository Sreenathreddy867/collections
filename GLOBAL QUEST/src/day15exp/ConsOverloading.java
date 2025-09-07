package day15exp;

public class ConsOverloading {
	private String name;
	private int age;
	public ConsOverloading(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public ConsOverloading( int age) {
		super();
	
		this.age = age;
	}
	public String toString() {
		return name+" "+age;
	}
	
	public static void main(String[] args) {
		ConsOverloading c1=new ConsOverloading(24);
		ConsOverloading c2=new ConsOverloading("sree",56);
		System.out.println(c1);
		System.out.println(c2);
	}
	

}
