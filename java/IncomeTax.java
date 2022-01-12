package assignmentjava1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0,inc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		inc=sc.nextDouble();
		if(inc<=180000)
			tax=0;
		else if(inc<=180001)
			tax=0.1*(inc-300000);
		else if(inc<=300001)
			tax=(0.2*(inc-500000))+(0.1*(180001-300000));
		else if(inc<=500001)
			tax=(0.3*(inc-1000000))+(0.2*(300001-500000))+(0.1*(180001-300000));
		
		System.out.println("Income tax amount is "+tax);
	}

}
