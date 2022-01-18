import java.util.*;

class contact{
int phnum;
String Name;
String Email;
String Gender;

public contact(int phnum, String name, String email, String Gender) {
	
	this.phnum = phnum;
	this.Name = name;
	this.Email = email;
	this.Gender = Gender;
}
public String toString() {
	return this.phnum +" "+this.Name +" "+this.Email +" "+this.Gender;
}


}
class Sortbyphnum implements Comparator<contact>{
	public int compare(contact a,contact b) {
		return b.phnum - a.phnum;
	}
}
public class Treemap {
static void example() {
	TreeMap<contact,Integer>treemap=new TreeMap<contact,Integer>(new Sortbyphnum());
	treemap.put(new contact(1234567897,"denny","denny@gmail.com","male"),3);
	treemap.put(new contact(1334567897,"benny","benny@gmail.com","male"),4);
	treemap.put(new contact(1134567897,"chinny","chinny@gmail.com","female"),2);
	treemap.put(new contact(1634567897,"byula","byula@gmail.com","female"),1);
	System.out.println("treemap:"+treemap);
	//a.fetch all keys and print them
	Set<contact>keys=treemap.keySet();
	for(contact key:keys) {
		System.out.println(key);
	}
	//b.fetch all values and print them
System.out.println("fetching all values:"+treemap.values());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c.print all key-value pairs
	System.out.println("treemap using");
	example();
	

	
	}
	}


