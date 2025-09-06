package ArrayList;

import java.util.ArrayList;

public class SecondArrayListVideo {

	public static void main(String[] args) {
		
//		ArrayList a1=new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		a1.add(40);
//		a1.add(50);
//		System.out.println(a1);  //[10, 20, 30, 40, 50]
//		
//		a1.add(2,99);  //ADD will make just add the element in that place...
//		System.out.println(a1);  //[10, 20, 99, 30, 40, 50]
//		
//		a1.set(3, 89);  //SET will delete the value and assigned
//		System.out.println(a1);  //[10, 20, 99, 89, 40, 50]
		
		
//		ArrayList a=new ArrayList();
//		System.err.println(a.size());  //0
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		System.out.println(a); //[10, 20, 30, 40, 50]
//		System.out.println(a.size()); //5
//		
//		a.trimToSize(); //Trimming use to clear the size or spaces in a code 
//		
//		System.out.println(a); //[10, 20, 30, 40, 50]

		
//		ArrayList a=new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		System.out.println(a);   //[10, 20, 30, 40, 50]
//		System.out.println(a.contains(20));  //true
//		System.out.println(a.contains(45));  //false
//		
//		ArrayList b=new ArrayList();
//		b.add(10);
//		b.add(20);
//		b.add(30);
//		b.add(40);
//		b.add(50);
//		System.out.println(b);  //[10, 20, 30, 40, 50]
//		
//		System.out.println(a.containsAll(b)); //true
//		System.out.println(b.getClass());  //class java.util.ArrayList
		
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		
		ArrayList b=(ArrayList)a.clone();  //CLONE() is used for create a duplicate
		System.out.println(b);
		
	}
}
