import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
/*class product{
	private double price=0.0;
	public void setPrice(double price) {
		this.price=price;
	}
public void printprice() {
	System.out.println(price);
}


}*/
public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//predicate
	/*	Predicate<String>isLongWord=t->t.length()>10;
		String s="mounika";
		boolean result=isLongWord.test(s);
		
		List<String>m=new ArrayList<>();
m.add("mounika");
m.add("capgemini");
m.add("employee");
List<String>filtered=m.stream().filter(n->n.length()>5).collect(Collectors.<String>toList());
System.out.println(filtered);
//consumer
Consumer<product>updatePrice=p->p.setPrice(5.9);
product p=new product();
updatePrice.accept(p);
p.printprice();*/
		//FUNCTION
/*int n=5;
modifyTheValue( n,val->val+10);
modifyTheValue( n,val->val*100);
}
	static void modifyTheValue(int v,Function<Integer,Integer>function){
		int result=function.apply(v);
		System.out.println(newValue);*/
	
		//SUPPLIER
	/*	int n=4;
		display(()->n+10);
		display(()->n+100);
	}
	static void display(Supplier<Integer> arg) {
		System.out.println(arg.get());
		
		*/
		
		
		
		
		
		
	}
}
 