package day12exp;

import java.util.Scanner;

public class EvenCheck {
	public static boolean isEven(int num) {
		return num%2==0;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=s.nextInt();
		System.out.println(isEven(num1));
	}

}
