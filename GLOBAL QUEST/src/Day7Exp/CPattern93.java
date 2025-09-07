package Day7Exp;

public class CPattern93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(((j==1)&&(i==2||i==3||i==4))||((i==1||i==5)
						&&(j==2||j==3||j==4))){
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
