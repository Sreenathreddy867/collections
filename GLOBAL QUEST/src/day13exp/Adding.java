package day13exp;

public class Adding {
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	public static void main(String[] args) {
		Adding a=new Adding();
		System.out.println(a.add(2,3));
		System.out.println(a.add(1, 2,3));
	}

}
