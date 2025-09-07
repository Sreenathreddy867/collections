package Day6Exp;

public class NumPattern84 {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}

}
