package assignmentjava1;

import java.util.Scanner;

public class AirthmetiAndUnsupportedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int a,b;
Scanner o=new Scanner(System.in);
System.out.println("Value of a:");
a=o.nextInt();
System.out.println("Value of b:");
b=o.nextInt();
System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Exception Handled"+e);
			System.out.println("UnsupportedOperationException");
		}
	}

}
