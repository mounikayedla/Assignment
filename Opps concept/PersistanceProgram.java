package assignmentjava1;
abstract class Persistence{
	abstract void persist();
}
class FilePersistence extends Persistence{
	void persist() {
		System.out.println("Data saved in File");
	}
}
class DatabasePersistence extends Persistence{
	void persist() {
		System.out.println("Data saved in Database");
	}
}
public class PersistanceProgram extends Persistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persistence o=new PersistanceProgram();
o.persist();
	}
void persist() {
	System.out.println("persist Method from persistanceprogram(client)");
}
}
