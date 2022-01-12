package assignmentjava1;

import java.util.Scanner;

public class simpleAndCompound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle,ri,time,SI,CI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		principle=sc.nextDouble();
		System.out.println("Enter the No. of years:");
		time=sc.nextDouble();
		System.out.println("Enter Rate of interest:");
		ri=sc.nextDouble();
		SI=(principle*time*ri)/100;
		CI=principle*Math.pow(1.0+ri/100.0,time)-principle;
		System.out.println("Simple Interest="+SI);
		System.out.println("Compound Interest="+CI);
			
	}

}
