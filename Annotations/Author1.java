
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	

	String supervisor();

	String name();

	String id();

	String date();

	String time();

	String version();
}
public class Author1 {
	@Info(id="101",name="Mounika",supervisor="Shilpa",date="23-12-2021",time="10AM",version="software")
	public void display() {
		
		
	}
	public static void main(String[] args) throws ReflectiveOperationException, SecurityException {
		// TODO Auto-generated method stub

		Author1 a = new Author1(); 
		a.display();  
		   Method m = a.getClass().getMethod("display"); 
		Info i = m.getAnnotation(Info.class);
		
		System.out.println("Author ID : " +i.id());
		System.out.println("Author Name: " +i.name());
		System.out.println("Supervisor Name: " +i.supervisor());
		System.out.println("Date: " +i.date());
		System.out.println("Time: " +i.time());
		System.out.println("Version: " +i.version());
		  
		
	}

	
}
