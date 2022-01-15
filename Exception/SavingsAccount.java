package exception;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{
	
}
public class SavingsAccount {
Scanner sc=new Scanner(System.in);
public void withdraw(double amt) {
	System.out.println("Enterid");
	long id=sc.nextLong();
	System.out.println("enter balance");
	double bl=sc.nextDouble();
	try {
		if(amt<=bl) {
			bl=bl-amt;
			System.out.println("balance:"+bl);
			
		}
		else {
			throw new InsufficientBalanceException();
		}
	}catch(InsufficientBalanceException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount s=new SavingsAccount();
s.withdraw(2100);
	}

}
