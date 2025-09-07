package day22exp;
interface I2{
	int a =20;
	void m1();
}
class B implements I2{
	public void m1() {
		a=2;
		System.out.println(a);
	}
}

public class Rule1Interface {

	public static void main(String[] args) {
		I2 a=new B();
		a.m1();
	}

}
