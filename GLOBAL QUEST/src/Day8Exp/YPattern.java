package Day8Exp;

public class YPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				if ((i==j||j+i==6)&&(i==1||i==2||i==3)||
						((i==4|i==5)&&(j==3))){
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
