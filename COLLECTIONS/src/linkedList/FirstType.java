package linkedList;

import java.util.LinkedList;

public class FirstType {

	public static void main(String[] args) {
//		LinkedList ll=new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(40.5);
//		ll.add("sree");
//		ll.add(30);
//		ll.add(40);
//		System.out.println(ll);  //[10, 20, 40.5, sree, 30, 40]
		
		
		//In linkedList also same methods are there whatever in a ArrayList and 
		//some extra methods are there 
		
		
		//Few Built-in methods in Linked List
		
//		LinkedList ll=new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.addFirst(5);
//		ll.addFirst(1);
//		ll.addLast(60);
//		ll.addLast(67);
//		System.out.println(ll);//[1, 5, 10, 20, 30, 60, 67]
//		System.out.println(ll.getFirst()); //1
//		System.out.println(ll.getLast());//67
//		System.out.println(ll.getClass());//class java.util.LinkedList
//		System.out.println(ll.peekFirst()); //1
//		System.out.println(ll);  //[1, 5, 10, 20, 30, 60, 67]
//		System.out.println(ll.pollFirst()); //1
//		System.out.println(ll); //[5, 10, 20, 30, 60, 67]
//		System.out.println(ll.peekLast()); //67
//		System.out.println(ll);  //[5, 10, 20, 30, 60, 67]
//		System.out.println(ll.pollLast()); //67
//		System.out.println(ll); //[5, 10, 20, 30, 60]
		
		
		//Differnece between getFirst and peekFirst
		
//		LinkedList ll=new LinkedList();
//		System.err.println(ll); //[]
//		//System.out.println(ll.getFirst()); //"Exception in thread "main" java.util.NoSuchElementException"
//		System.out.println(ll.peekFirst()); //null
//		System.out.println(ll); //[]

		//LINKEDLIST USING A STACK DATASTRUCTURE WITH PUSH AND POP METHODS
		
		LinkedList ll=new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println(ll);  //[40, 30, 20, 10]
		System.out.println(ll.poll()); //40
		System.out.println(ll);// [30, 20, 10]
		System.out.println(ll.pop()); //30
		System.out.println(ll);  //[20, 10]
		System.out.println(ll.pop()); //20
		System.out.println(ll); //[10]
		System.out.println(ll.pop()); //10
		System.out.println(ll); //[]
	}

}
