package day15exp;

public class ZeroParamConnstructor {
	public void add(int a,int b) {
		System.out.println(a+b); 
	}

	public static void main(String[] args) {
		ZeroParamConnstructor z=new ZeroParamConnstructor();
		z.add(1, 5);
	}

}
