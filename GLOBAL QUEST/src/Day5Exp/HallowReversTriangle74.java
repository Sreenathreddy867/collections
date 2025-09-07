package Day5Exp;

public class HallowReversTriangle74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++) {
				if(i==1 || j==1 || j==6-i) {
					System.out.print("* ");
				}
				else { 
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
