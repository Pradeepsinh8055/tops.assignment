package module2;

import java.util.*;

public class ComparingString {
	public static void main(String[]args)
	{
	
	String str1 = "topsint.com";
	String str2 = "topsint.com";
	String str3 = "Topsint.com";
	
	System.out.println("for equals ");
	System.out.println("topsint.com and topsint.com : " + str1.equals(str2));
	System.out.println("Topsint.com and topsint.com : " + str3.equals(str2));
	
	System.out.println(" ");
	System.out.println("forequalsignorecase");
	System.out.println("topsint.com and topsint.com : " + str1.equalsIgnoreCase(str2));
	System.out.println("Topsint.com and topsint.com : " + str1.equalsIgnoreCase(str2));
	}
	
	

}
