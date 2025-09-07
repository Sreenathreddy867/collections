package Day3Exp;
import java.util.Scanner;

public class PostUser33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("Enter a value for a: ");
		int a=s.nextInt();
		int b=a++;
		System.out.println(a);
		System.out.println(b);
	}

}
