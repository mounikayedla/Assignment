import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Transaction {
String name;
String city;
int year;
int value;

	public Transaction(String name,String city, int year, int value) {
	this.name=name;
	this.city = city;
	this.year = year;
	this.value = value;
	
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Transaction> m1=new ArrayList<Transaction>();
		
		m1.add(new Transaction("mounika","khammam", 2011,250));
		m1.add(new Transaction("raj", "hyderabad", 2018,1200));
		m1.add(new Transaction("byula","palvancha",2011,950));
		m1.add(new Transaction("sony", "Delhi", 1999,450));
		m1.add(new Transaction("sandy","Delhi", 2011,350));
System.out.println("printing all the transcation value living in delhi");
		
		m1.stream().filter(n->n.getCity().contains("Delhi"))
		.forEach(pr->System.out.println(pr.getName()+" "+pr.getValue()+" "+pr.getYear()));
		
		// What's the highest value of all the transactions ------>Question14
		System.out.println("highest value of all transcation");
		
		Optional<Integer> max=m1.stream().map(n->n.getValue()).max((v1,v2) -> v1.compareTo(v2));
		System.out.println(max.get());
		
		// Find the transaction with the smallest value ------->Question15
        System.out.println("smallest value of all transcation");
		
		Optional<Integer> min=m1.stream().map(n->n.getValue()).min((v1,v2) -> v1.compareTo(v2));
		System.out.println(min.get());
		
		//Find all transactions in the year 2011 and sort them by value(Small to high)------>Question8
		System.out.println("transaction in 2011 and sort by value small to large");
		m1.stream().filter(n->n.getYear()==(2011)).sorted((p1,p2) -> p1.getValue()-p2.getValue()).forEach(p-> System.out.println(p.getName()+" "+p.getValue()));

	}





	}


