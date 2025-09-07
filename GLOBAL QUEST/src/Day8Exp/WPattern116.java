package Day8Exp;

public class WPattern116 {

	public static void main(String[] args) {
		for(int i=1;i<=13;i++) {
			
			for(int j=1;j<=13;j++) {
				if((i==1)&&(j==1||j==7||j==13)||
						((i==2)&&(j==2||j==6||j==8||j==12))||
						((i==3)&&(j==3||j==5||j==9||j==11))||
						((i==4)&&(j==4||j==10))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
