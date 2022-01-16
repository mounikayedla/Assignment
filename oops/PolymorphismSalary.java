package assignmentjava1;
class bank {
	void display()
	{
		System.out.println("account");
	
	}
}

 class saving extends bank{
	void display()
	{
		int number=10000;
		System.out.println("saving account holder");
		System.out.println("Fixed deposit:"+number);
	}

}

 class current extends bank {
	void display()
	{
		int number=5000;
		System.out.println("Current account holder");
		System.out.println("credit cash:"+number);
	}


}

public class PolymorphismSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b ;
		
		b=new saving();
		b.display();
		b=new current();
		b.display();
	}

	}


