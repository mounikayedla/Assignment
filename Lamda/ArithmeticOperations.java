import java.lang.invoke.*;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arithmetic addition = (int n1,int n2)->n1+n2;
Arithmetic subtraction = (int n1,int n2)->n1-n2;
Arithmetic multiplication = (int n1,int n2)->n1*n2;
Arithmetic division = (int n1,int n2)->n1/n2;
System.out.println("Addition:"+addition.operation(10,5));
System.out.println("Subtraction:"+subtraction.operation(10,5));
System.out.println("Multiplication:"+multiplication.operation(16,8));
System.out.println("Division:"+division.operation(10,10));
	}

}
@FunctionalInterface
interface Arithmetic{
	int operation(int n1,int n2);
}