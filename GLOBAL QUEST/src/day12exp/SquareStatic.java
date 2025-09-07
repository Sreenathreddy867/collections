package day12exp;

import java.util.Scanner;

public class SquareStatic {
	public static int square(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=s.nextInt();
		System.out.println("value is: "+square(num));
		
	}

}
