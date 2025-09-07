package Day5Exp;

public class PentagonDaimond66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			for(int k=1;k<=6-i-1;k++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

		
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
