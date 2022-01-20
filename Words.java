package assignmentjava1;

import java.util.List;
import java.util.function.Consumer;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
var Words=List.of("Mounika","Sandhya","Raju","Byula");
Words.forEach(new Consumer<String>() {
	public void accept(String s) {
		StringBuilder b=new StringBuilder();
		for(String str:s.split(" ")) {
			b.append(str.charAt(0));
		}
	System.out.println(b.toString());
	}
}

		
		
		);
	}

}
