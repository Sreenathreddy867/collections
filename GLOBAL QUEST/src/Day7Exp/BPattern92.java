package Day7Exp;

public class BPattern92 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1) {
					System.out.print("*");
				}
				if((i==1 ||i==3 || i==5)&&(j==2 || j==3)) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				if((i==2 || i==4)&&(j==4)) {
					System.out.print("* ");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
