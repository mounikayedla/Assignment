import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Trader {
String name;
String city;

	public Trader(String name, String city) {
	
	this.name = name;
	this.city = city;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Trader>m=new ArrayList<Trader>();
m.add(new Trader("Mounika","Hyderabad"));
m.add(new Trader("Raj","Khammam"));
m.add(new Trader("Byula","Mumbai"));
m.add(new Trader("Sony","Pune"));

System.out.println("---------------------------Question10-------------------------------------");
//sort them by name
List<Trader> sortNames = m.stream().filter(e -> e.getCity().equalsIgnoreCase("pune")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
System.out.println(sortNames);
System.out.println("---------------------------Question11-------------------------------------");
List<String> stringList = m.stream().map(Trader::getName).sorted().collect(Collectors.toList());
stringList.forEach(System.out::println);
System.out.println("---------------------------Question12-------------------------------------");
m.stream().filter(e -> e.getCity().equalsIgnoreCase("indore")).forEach(System.out::println);
System.out.println("---------------------------Question9-------------------------------------");
m.stream().map(Trader::getCity).distinct().forEach(System.out::println);



	}

}
