package ArrayList;

import java.util.ArrayList;

public class FirstExmp {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add("ram");
//		a1.add(10.5);
//		a1.add(true);
//		System.out.println(a1); // [10, 20, 30, ram, 10.5, true]
		
		
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(40);
//		a1.add(50);
//		System.out.println(a1); //[10, 20, 30, 40, 50]
//		a1.add(2,90);
//		System.out.println(a1);  //[10, 20, 90, 30, 40, 50]
//		ArrayList b=new ArrayList();
//		b.add(100);
//		b.add(200);
//		b.add(300);
//		b.add(400);
//		System.out.println(b);  //[100, 200, 300, 400]
//		a1.addAll(b);
//		System.out.println(a1);  //[10, 20, 90, 30, 40, 50, 100, 200, 300, 400]
//		a1.addAll(2,b);
//		System.out.println(a1); //[10, 20, 100, 200, 300, 400, 90, 30, 40, 50, 100, 200, 300, 400]
	
		//INDEX

//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(40);
//		a1.add(50);
//		System.out.println(a1);  //[10, 20, 30, 40, 50]
//		System.out.println(a1.get(2));  //30
//		System.out.println(a1.subList(0, 3));//[10, 20, 30]
//		System.out.println(a1.indexOf(30)); //2
//		a1.add(30);
//		System.out.println(a1.indexOf(30));//2
//		System.out.println(a1.lastIndexOf(30));//5
		
		//Remove Elements
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(40);
//		a1.add(50);
//		System.out.println(a1);//[10, 20, 30, 40, 50]
//		a1.remove(2);
//		System.out.println(a1); //[10, 20, 40, 50]
//		a1.remove(new Integer(50));
//		System.out.println(a1);  //[10, 20, 40]
//		
//		ArrayList b=new ArrayList();
//		b.add(20);
//		b.add(40);
//		System.out.println(b);//[20, 40]
//		a1.removeAll(b);
//		System.out.println(a1);  //[10]
//		a1.clear();
//		System.out.println(a1);  //[]

		
		//RETAIN ALL VALUES (REPLACE)
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);  //[10, 20, 30, 40, 50]
		ArrayList b=new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);  //[20, 40]
		a1.retainAll(b);
		System.out.println(a1);  //[20, 40]
		
		//SREENATH REDDY VENKATANNAGARI
		System.out.println("SREEnath Reddy VENKAtannagari...");
	}
	

}
