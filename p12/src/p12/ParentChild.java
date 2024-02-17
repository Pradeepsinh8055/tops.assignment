package module2;

class Parent
{
	void parentMethod()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	void childMethod()
	{
		System.out.println("This is child class");
	}
}

public class ParentChild {
	public static void main(String[] args)
	{
		Parent pt=new Parent();
		Child c=new Child();
		
		pt.parentMethod();
		c.childMethod();
		c.parentMethod();
		
	}

}
