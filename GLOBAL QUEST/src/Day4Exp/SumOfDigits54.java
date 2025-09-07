package Day4Exp;
import java.util.Scanner;

public class SumOfDigits54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=s.nextInt();
		int sum=sumOfDigits(number);
		System.out.println("Sum of Digits: "+sum);

	}
	public static int sumOfDigits(int number) {
		int sum=0;
		while(number!=0) {
			sum+=number%10;
			number/=10;
			
			
		}
		return sum;
	}

}
