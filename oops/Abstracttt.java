package assignmentjava1;
abstract class test{
	void play() {
		System.out.println("playing");
	}
void game() {
	System.out.println("game playing");
}


}

public class Abstracttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub d1=new test();
	
}
}
/*Error:The type test must be an abstract class to define abstract methods
The abstract method game in type test can only be defined by an abstract class
Abstract methods do not specify a body*/

/*

ii. When we extend an abstract class ,we must override all the abstract method in subclass or declare sub class as abstract

public class demo extends call {
	public void dispaly2()
	{
	
	System.out.println("HI");
	}
	public static void main(String[] args)
	{
			
			demo d= new demo();
			d.dispaly2();
			
			
		}
	}

abstract class call {
 void display()
{
	System.out.println("hello");
}
}
Output: HI

iii. Abstarct class cannot be private
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Implicit super constructor call() is not visible for default constructor. Must define an explicit constructor

Iv . Abstarct class cannot be final
   Yes it can’t be a final because final is not a access specifier

v. you can declare abstract class without abstract method
 yes we can create abstract class without a method.*/

