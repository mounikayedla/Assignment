package assignmentjava1;

import java.util.Scanner;

public class subgetsandconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eng,phy,chem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the English marks");
		eng=sc.nextInt();
		System.out.println("Enter the Physics marks");
		phy=sc.nextInt();
		System.out.println("Enter the Chemistry marks");
		chem=sc.nextInt();
		if((eng>60)&&(phy>60)&&(chem>60))
			System.out.println("Result should be passed");
		else if(((eng<=60)&&(chem>60)&&(phy>60))||((eng>60)&&(chem<=60)&&(phy>60))||((eng>60)&&(chem<60)&&(phy<=60)))
			System.out.println("Result should be promoted");
		else
			System.out.println("Result should be failed");
	}

}
