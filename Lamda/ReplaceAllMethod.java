import java.util.ArrayList;
import java.util.Arrays;



public class ReplaceAllMethod {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
ArrayList<String>alp=new ArrayList<>(Arrays.asList("mounika","raju","a","byula"));
System.out.println(alp);
alp.replaceAll(e ->e.toUpperCase());
System.out.println(alp);
	}

}
