package module2;

public class PrintNumber {
	
	void printn(int num) {
		System.out.println("int = " + num);
		
	}
	void printn(float num) {
		System.out.println("float = " + num);
		
	}
	void printn(double num) {
		System.out.println("double= " + num);
		
	}
	void printn(long num) {
		System.out.println("long = " + num);
		
	}
	public static void  main(String[]args) {
		PrintNumber p = new PrintNumber();
		p.printn(1);
		p.printn(1l);
		p.printn(1.0);
		p.printn(1.0f);
	}
	

}
