package day12exp;

public class StaticMethod168 {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		StaticMethod168 s=new StaticMethod168();
		System.out.println(s.add(5, 4));
	}
}
