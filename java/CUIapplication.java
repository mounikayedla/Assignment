package assignmentjava1;

import java.util.Scanner;

public class CUIapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sp=" ";
		System.out.println("Enter username");
		String usrname=sc.nextLine();
		if((usrname.contains(sp))||usrname.length()<6) {
			System.out.println("Invalid username");
			return;
		}
		System.out.println("Enter password");
		String usrpwd=sc.nextLine();
		if((usrpwd.contains(sp))||usrpwd.length()<6) {
			System.out.println("Invalid password");
			return;
		}
		System.out.println(usrname+ "you are registered successfully");
		System.out.println("Enter username");
		String lname=sc.nextLine();
		System.out.println("Enter password");
		String lpwd=sc.nextLine();
		if(usrname.equals(lname)&&usrpwd.equals(lpwd)) {
			System.out.println("Welcome"+lname+"you have logged in successfully");
		}
			else {
				System.out.println("Username or password mismatch");
			}
	}

}
