package assignmentjava1;

public class StrMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Java String pool refers to collection of Strings which are stored in heap memory";
	     boolean s1 = str.matches("java string pool refers to collection of strigs which are stored in heap memory");  
	        System.out.println("Original String  : " + str);
	        System.out.println(" String Matches : " + s1);
	}

}
