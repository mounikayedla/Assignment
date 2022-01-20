import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
class Employee implements Comparable<Employee>{
	int Id;
	String Name;
	
	int Salary;
	public Employee(int id, String name,  int salary) {
		
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
	}
public int compareTo(Employee e) {
	if(Id>e.Id) {
		return 1;
	}else if(Id<e.Id) {
		return -1;
	}else {
		return 0;
	}
}
public String getName() {
	// TODO Auto-generated method stub
	return Name;
}
}

public  class RemoveIfmethod {
	public static void main(String[] args) {
		ArrayList<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee(101,"mounika",25000));
		employees.add(new Employee(101,"raju",25000));
		employees.add(new Employee(101,"manasa",25000));
		employees.add(new Employee(101,"kavya",25000));
		employees.add(new Employee(101,"mouna",25000));
		Predicate<Employee>condition=employee->employee.getName().startsWith("m");
employees.removeIf(condition);
System.out.println(employees);
	}
}


