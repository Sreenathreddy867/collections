package Day7Exp;

public class APattern91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1 || j==1 || j==i || i==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			System.out.println();
		}

	}

}
