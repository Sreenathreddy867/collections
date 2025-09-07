package Day4Exp;
import java.util.Scanner;
public class CheckShort51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt();
		if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) {
			System.out.println(n+" is Short value");
		}
		else {
			System.out.println(n+" is not Short value");
		}
	}

}
