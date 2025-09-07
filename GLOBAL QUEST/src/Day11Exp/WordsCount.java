package Day11Exp;
//import java.util.Scanner;
import java.util.StringTokenizer;


public class WordsCount {
	
	public static void main(String[] args) {
		int count=0;
		String s1="haai j";
		StringTokenizer str=new StringTokenizer(s1,"j");
		while(str.hasMoreTokens()) {
			str.nextToken();
			count++;
		}
		System.out.println(count);
	}

}
