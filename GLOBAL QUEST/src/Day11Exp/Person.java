package Day11Exp;

public class Person {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person p=new Person("sree",22);
		Person g=new Person("siri",20);
		System.out.println(p);
		System.out.println(g);
		p.setName("siri");
		p.setAge(20);
		p.getName();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		
	}

}
