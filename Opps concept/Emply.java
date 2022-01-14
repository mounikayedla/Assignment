package assignmentjava1;

import java.util.Scanner;

class employee {
	void emp()
	{
	System.out.println("employee salary");
	}
}


 class manager extends employee {
	void incentive()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("incentive:");
		int ince;
		ince=scan.nextInt();
		ince=ince+10000;
		System.out.println("salary of the manager:"+ince);
		
	}
}
 class labour extends employee {
	void OT()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("OT:");
		int OT;
		OT=scan.nextInt();
		OT=OT+10000;
		System.out.println("salary of the labour:"+OT);	
	}
}

public class Emply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m=new manager();
		m.emp();
		m.incentive();	
		labour l=new labour();
		l.emp();
		l.OT();

	}

}
