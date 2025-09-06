package PriorityQueue;

import java.util.PriorityQueue;

public class FirstExmp {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(120);
		p.add(60);
		p.add(160);
		p.add(30);
		p.add(80);
		p.add(140);
		p.add(180);
		System.out.println(p);
		p.remove(30);
		System.out.println(p);
	}

}
