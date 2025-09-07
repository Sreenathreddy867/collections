package Day2Exp;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stuc
		Scanner sree=new Scanner(System.in);
		System.out.print("Enter a char: ");
		char c=sree.next().charAt(0);
		if (c>='A' && c<='Z'){
			System.out.println("Welcome "+Character.toLowerCase(c));
		}
		if (c>='a' && c<='z'){
			System.out.println("Welcome "+Character.toUpperCase(c));
		}
		else {
			System.out.println("Invalid");
		}
		

	}

}
