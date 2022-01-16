import java.util.HashSet;
import java.util.Set;

class Employee{
int id,salary;
String name,department;
public  Employee(int id,int salary,String name, String department) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

public void displayDetails() {
	System.out.println("id:"+getId() + "salary:"+getSalary()+ "name:"
			+getName()+ "department:"+getDepartment());
}

}
public class Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee>set=new HashSet<>();
Employee emp=new Employee(1,25000,"Mounika","Analyst");
set.add(emp);
emp.displayDetails();
	}

}
