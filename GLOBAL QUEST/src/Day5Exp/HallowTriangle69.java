package Day5Exp;

public class HallowTriangle69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Print "O"
            for (int k = 1; k <= i; k++) {
                if (i==5 || k == 1 || k == i) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
		}
	}

}
