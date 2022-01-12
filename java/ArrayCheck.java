package assignmentjava1;

import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,n,search,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter "+n+"elements");
		for(c=0;c<n;c++)
			arr[c]=sc.nextInt();
		System.out.println("Enter the value to find");
		search=sc.nextInt();
		for(c=0;c<n;c++)
		{
			if(arr[c]==search) {
				System.out.println(search+"is present in array");
				break;
			}
		}
			if(c==n)
				System.out.println(search+"is not present in array");
			
			
	}

}
