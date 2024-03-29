package module2;

abstract class Parent1 {

	abstract void message();
}

class Child1 extends Parent1 {

	void message() {
		System.out.println("This is first subclass");
	}
}

class Child2 extends Parent1 {
	
	void message() {
		System.out.println("This is second subclass");
	}
}

public class AbstactParentDemo {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.message();
		
		Child2 c2 = new Child2();
		c2.message();

	}

}
