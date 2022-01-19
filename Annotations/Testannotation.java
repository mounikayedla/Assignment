import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String name();
}
class example{
	@Test(name="Mounika")
public void eat() {
	System.out.println("Dog is eating");
}

}
	public class Testannotation {
		
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method s
		example a=new example();
		a.eat();
		Method m=a.getClass().getMethod("eat");
Test t=m.getAnnotation(Test.class);
System.out.println(t.name());
}

	
	
	}


