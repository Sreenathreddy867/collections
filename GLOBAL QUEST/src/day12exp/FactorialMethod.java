package day12exp;
import java.util.Scanner;

public class FactorialMethod {
	public static void facto(int num) {
		if(num<0) {
			System.out.println("negative number");
		}
		else if(num==0||num==1) {
			System.out.println(1);
		}
		else {
			long r=1;
			for(int i=2;i<=num;i++) {
				r*=i;
			}
			System.out.println(r);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		
		facto(num);
	}

}
	