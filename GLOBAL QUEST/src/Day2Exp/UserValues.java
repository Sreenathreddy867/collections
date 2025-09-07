package Day2Exp;
import java.util.Scanner;
public class UserValues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a upper letter: ");
		char c=scan.next().charAt(0);
		System.out.println(Character.toLowerCase(c));
		

	}
 
}
