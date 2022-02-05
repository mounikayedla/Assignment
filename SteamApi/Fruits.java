import java.util.ArrayList;
import java.util.stream.Stream;

public class Fruits {
	String name;
	int price;
	int calories;
	String color;
	public Fruits(String name,int price, int calories,String color) {
		this.name=name;
		this.price=price;
		this.calories=calories;
		this.color=color;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruits>list=new ArrayList<Fruits>();
		list.add(new Fruits("mango",500,150,"green"));
		list.add(new Fruits("banana",200,90,"yellow"));
		list.add(new Fruits("apple",300,250,"red"));
		list.add(new Fruits("grapes",200,70,"green"));
		list.add(new Fruits("pineapple",300,150,"brown"));
		//---------------------------------------------------------
		
		/*1.Stream<Fruits> filtereddata=list.stream().filter(F->F.calories<100);
		filtereddata.forEach
		(
				Fruit ->{
					System.out.println(Fruit.name+":"+Fruit.calories);
					}
				);*/
		
		
		
		//-----------------------------------------------------------
		
		
		/*   2.Stream<Fruits> filtereddata=list.stream().filter(q2->q2.color=="red");
		filtereddata.forEach
		(
				q2 ->{
					System.out.println(q2.name+"->"+q2.color);
					}
				);

		// TODO Auto-generated method stub*/
	/*3	Stream<Fruits> filtereddata=list.stream().filter(F->F.color=="yellow");
		filtereddata.forEach
		(
				Fruit ->{
					System.out.println(Fruit.name+"---->"+Fruit.color);
										}
				);*/
	}

}
