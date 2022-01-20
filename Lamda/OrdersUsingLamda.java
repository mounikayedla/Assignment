import java.util.ArrayList;
import java.util.stream.Stream;

public class OrdersUsingLamda {
float price;
String ordername;
String orderaddress;
String orderstatus;

	public OrdersUsingLamda(float price, String ordername, String orderaddress, String orderstatus) {
	
	this.price = price;
	this.ordername = ordername;
	this.orderaddress = orderaddress;
	this.orderstatus = orderstatus;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<OrdersUsingLamda>list=new ArrayList<OrdersUsingLamda>();
list.add(new OrdersUsingLamda(18000,"poco","khammam","ACCEPTED"));
list.add(new OrdersUsingLamda(118000,"IPHONE","hyderabad","ACCEPTED"));
list.add(new OrdersUsingLamda(9000,"vivo","chennai","COMPLETED"));
list.add(new OrdersUsingLamda(85000,"oppo","pune","ACCEPTED"));
list.add(new OrdersUsingLamda(20000,"samsung","banglore","COMPLETED"));
Stream<OrdersUsingLamda>filtereddata=list.stream().filter(o->o.price>10000);
filtereddata.forEach(
		OrdersUsingLamda->{
			System.out.println(OrdersUsingLamda.ordername+":"+OrdersUsingLamda.price);
			System.out.println(OrdersUsingLamda.orderstatus);
		}
		
		);


	}

}
