package day12exp;

public class NonStatic166 {
	public void greet() {
		System.out.println( "Hello, welcome to Java programming!");
	}
	public static void main(String[] args) {
		NonStatic166 s=new NonStatic166();
		s.greet();
	}

}
