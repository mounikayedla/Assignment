import java.util.ArrayList;
/*4.
interface myInt {
	int add(int a, int b);
}*/
public class VarKeyword {
	//1.var keyboard cannot be used as an instance and a global variable.
	//var x = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(x);
		//Output: Cannot make a static reference to the non-static field x
	/* 2: var cannot be used as a generic type
		var<var> v = new ArrayList<>();
		
		  // add elements
      v.add(10);
      v.add(20);
      v.add(30);
      
      // print the list
      System.out.println(v);
Output:  Cannot prog.java:11:error: ‘var’ is not allowed here
      var<var> v = new ArrayList<>();
      1 error*/
		//---------------------------------------------------------
		
		/* 3: var cannot be used without explicit initialization
        var variable;
        
        // This is also not valid
      var variable = null;
      
      Output: Cannot use 'var' on variable without initializer
  	Duplicate local variable variable
  	Cannot infer type for local variable initialized to 'null'

*/
		//--------------------------------------------------------
		/*4: var cannot be used with lambda expression
		var v = (a,b) -> (a + b);
		System.out.println(v.add(2,3));
		
		Output: Lambda expression needs an explicit target-type
	Cannot invoke add(int, int) on the primitive type null

*/
	}

}
