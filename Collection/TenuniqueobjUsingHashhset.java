import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TenuniqueobjUsingHashhset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("Mounika");
hs.add("Mouna");
hs.add("Sandhya");
hs.add("Mouna");
hs.add("Raju");
hs.add("Lucky");
hs.add("Byula");
hs.add("Manasa");
hs.add("Chacko");
hs.add("Lucky");
System.out.println("Using HashSet:");
Iterator<String>m=hs.iterator();
while(m.hasNext())
	System.out.println(m.next());
//Using TreeSet
Set<String>t=new TreeSet<String>();
t.add("Mounika");
t.add("Mouna");
t.add("Sandhya");
t.add("Mouna");
t.add("Raju");
t.add("Lucky");
t.add("Byula");
t.add("Manasa");
t.add("Chacko");
t.add("Lucky");
System.out.println("Using TreeSet:");
Iterator<String>ts=t.iterator();
while(ts.hasNext())
	System.out.println(ts.next());
	}

}
