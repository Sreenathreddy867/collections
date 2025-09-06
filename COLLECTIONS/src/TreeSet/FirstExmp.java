package TreeSet;

import java.util.TreeSet;

public class FirstExmp {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(120);
		t.add(60);
		t.add(160);
		t.add(30);
		t.add(80);
		t.add(140);
		t.add(180);
		System.out.println(t); //[30, 60, 80, 120, 140, 160, 180]
		System.out.println(t.ceiling(50)); //60
		System.out.println(t.floor(50));   //30
		System.out.println(t.higher(50));  //60
		System.out.println(t.lower(50));   //30
		System.out.println(t.ceiling(80)); //80
		System.out.println(t.higher(80));  //120
		System.out.println(t.floor(120));  //120
		System.out.println(t.lower(120));  //80
	}
	
}
