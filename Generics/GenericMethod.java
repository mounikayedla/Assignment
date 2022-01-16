import java.util.Arrays;

public class GenericMethod {
public static <T> void swap(T[] a,int i,int j ) {
	T temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]a= {"1","2","3","4"};
System.out.println("Before swap:"+Arrays.toString(a));
swap(a,0,3);
System.out.println("After swap:"+Arrays.toString(a));
	}

}
