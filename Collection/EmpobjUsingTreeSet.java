import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int Id;
	String Name;
	String Department;
	int Salary;
	public Employee(int id, String name, String department, int salary) {
		
		this.Id = id;
		this.Name = name;
		this.Department = department;
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
}
public class EmpobjUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee>set=new TreeSet<Employee>();
Employee e1=new Employee(101,"Mounika","Software",25000);
Employee e2=new Employee(102,"Manasa","Developer",28000);
Employee e3=new Employee(103,"Mounisha","Analyst",35000);
Employee e4=new Employee(104,"Manvitha","Bussiness ",31000);
Employee e5=new Employee(105,"Monalisa","Teacher",32000);
Employee e6=new Employee(106,"Raju","Helper",55000);
Employee e7=new Employee(107,"Lucky","Software",30000);
Employee e8=new Employee(108,"Revathi","system analyst",45000);
Employee e9=new Employee(109,"Angel","QA analyst",22000);
Employee e10=new Employee(110,"Chinny","Test Engineer",23000);
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	set.add(e6);
	set.add(e7);
	set.add(e8);
	set.add(e9);
	set.add(e10);
	for(Employee e:set) {
		//System.out.println(e.Id+" "+e.Name+" "+e.Department+" "+e.Salary);
		//System.out.println("Sorted by name:"+e.Name);
		//System.out.println("Sorted by Id:"+e.Id);
		System.out.println("Sorted by Department:"+e.Department);
	}
	

	
	}

}
