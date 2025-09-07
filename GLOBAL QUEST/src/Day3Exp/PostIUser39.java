package Day3Exp;

import java.util.Scanner;

public class PostIUser39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a=s.nextInt();
		System.out.print("Enter b value: ");
		int b=s.nextInt();
		int c=a++ / b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
