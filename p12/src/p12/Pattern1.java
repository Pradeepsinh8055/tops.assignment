package module2;

public class Pattern1 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			int num = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
