package exception;

import java.util.Scanner;

class IllegalBankTransactionException extends RuntimeException{
	
}
public class SavingAccount {
	Scanner sc=new Scanner(System.in);
	public void withdraw(double amt) {
		System.out.println("Enterid");
		long id=sc.nextLong();
		System.out.println("enter balance");
		double bl=sc.nextDouble();
		try {
			if(amt>0) {
				
				System.out.println("balance:"+bl);
				
			}
			else {
				throw new IllegalBankTransactionException();
			}
		}catch(IllegalBankTransactionException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount s=new SavingsAccount();
s.withdraw(-21000);
	}

}
