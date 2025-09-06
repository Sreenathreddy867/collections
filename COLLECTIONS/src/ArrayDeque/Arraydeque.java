package ArrayDeque;

import java.util.ArrayDeque;
public class Arraydeque {

	public static void main(String[] args) {
		
//		ArrayDeque ad=new ArrayDeque();
//		ad.add(10);
//		ad.add(20);
//		ad.add(30);
//		ad.add(40);
//		ad.add(50);
//		System.out.println(ad); //[10, 20, 30, 40, 50]
//		System.out.println(ad.pollFirst()); //10
//		System.out.println(ad.pollFirst()); //20
//		System.out.println(ad.pollFirst()); //30
//		System.out.println(ad.pollFirst()); //40
//		System.out.println(ad.pollFirst()); //50
		
		//ARRAYDEQUE ALSO CAN USE THE STACK DATA STRUCTURE WITH PUSH AND POP METHODS
		
		ArrayDeque ad=new ArrayDeque();
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad);
	}

}
