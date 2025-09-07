package day22exp;
interface I1{
	public void m1();
}
class A implements I1{
	public void m1() {
		System.out.println("Welcome to interface");
	}
}
public class Interface {
	public static void main(String[] args) {
		A c=new A();
		c.m1();
	}

}
